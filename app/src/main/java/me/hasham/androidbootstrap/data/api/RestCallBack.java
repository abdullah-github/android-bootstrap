package me.hasham.androidbootstrap.data.api;


import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Developed by Hasham.Tahir on 10/6/2016.
 */

public interface RestCallBack {
    void onRestResponse(String action, Call<ResponseBody> call, String response, Throwable t);
}
