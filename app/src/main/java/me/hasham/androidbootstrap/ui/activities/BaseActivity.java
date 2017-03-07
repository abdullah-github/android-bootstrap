package me.hasham.androidbootstrap.ui.activities;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import java.net.ConnectException;

import javax.inject.Inject;

import me.hasham.androidbootstrap.ApplicationMain;
import me.hasham.androidbootstrap.data.api.ApiEndpoints;
import me.hasham.androidbootstrap.data.api.RestCallBack;
import me.hasham.androidbootstrap.util.HLog;
import me.hasham.androidbootstrap.util.Loading;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Developed by Hasham.Tahir on 3/7/2017.
 */

public class BaseActivity extends AppCompatActivity {

    public static final String NO_INTERNET = "NO_INTERNET";

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    Context context = BaseActivity.this;
    @Inject
    Retrofit retrofit;
    Loading loading;
    private ApiEndpoints apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((ApplicationMain) getApplication()).getRestComponent().inject(this);

        apiService = retrofit.create(ApiEndpoints.class);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    protected void apiCall(Call<ResponseBody> call, final String callbackAction, final RestCallBack restCallBack, final boolean showLoader) {

        if (isConnectingToInternet()) {

            try {
                if (showLoader) {
                    loading.show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            call.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    try {
                        String bodyString = new String(response.body().bytes());
                        HLog.e("onResponse", callbackAction + " " + bodyString);
                        restCallBack.onRestResponse(callbackAction, call, bodyString, null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        if (showLoader) {
                            loading.dismiss();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {

                    if (t instanceof java.net.SocketTimeoutException || t instanceof ConnectException) {
//                        HAlert.showToast(BaseActivity.this, getString(R.string.cannotConnect));
                    }

                    restCallBack.onRestResponse(callbackAction, call, null, t);
                    try {
                        if (showLoader) {
                            loading.dismiss();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } else {
//            HAlert.showToast(BaseActivity.this, getString(R.string.cannotConnect));
            restCallBack.onRestResponse(callbackAction, call, null, new Throwable(NO_INTERNET));
        }

    }

    private boolean isConnectingToInternet() {
        ConnectivityManager connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo netInfo = connectivity.getActiveNetworkInfo();
            return netInfo != null && netInfo.isConnected();
        } else {
            return false;
        }
    }

    public void hideKeyboard() {

        View view = getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void changeFontInViewGroup(ViewGroup viewGroup, String fontPath) {

        Typeface typeface = Typeface.createFromAsset(getAssets(), fontPath);

        ViewGroup vg = (ViewGroup) viewGroup.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(typeface);
                }
            }
        }
    }

    public void requestMenu(String callbackAction, RestCallBack restCallBack, boolean showLoader) {

        apiCall(apiService.getMenu(), callbackAction, restCallBack, showLoader);
    }
}
