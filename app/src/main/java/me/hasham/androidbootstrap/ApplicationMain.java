package me.hasham.androidbootstrap;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.karumi.dexter.Dexter;

import me.hasham.androidbootstrap.dependencies.components.DaggerRestComponent;
import me.hasham.androidbootstrap.dependencies.components.RestComponent;
import me.hasham.androidbootstrap.dependencies.modules.AppModule;
import me.hasham.androidbootstrap.dependencies.modules.NetModule;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Developed by Hasham.Tahir on 12/30/2016.
 */

public class ApplicationMain extends Application implements Application.ActivityLifecycleCallbacks {

    private static Activity visibleActivity = null;
    private Context mAppContext;
    private RestComponent restComponent;

    public static Activity getVisibleActivity() {
        return visibleActivity;
    }

    public void setVisibleActivity(Activity activity) {
        visibleActivity = activity;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onCreate() {
        super.onCreate();

        Dexter.initialize(this);

        String fontPath = "fonts/Roboto-Regular.ttf";

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(fontPath)
                .setFontAttrId(R.attr.fontPath)
                .build());

        registerActivityLifecycleCallbacks(this);

        restComponent = DaggerRestComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this))
                .netModule(new NetModule("YOUR_API_BASE_URL_HERE"))
                .build();

    }

    public RestComponent getRestComponent() {
        return restComponent;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

        setVisibleActivity(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {

        setVisibleActivity(activity);
    }

    @Override
    public void onActivityResumed(Activity activity) {

        setVisibleActivity(activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {

        setVisibleActivity(null);
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }
}
