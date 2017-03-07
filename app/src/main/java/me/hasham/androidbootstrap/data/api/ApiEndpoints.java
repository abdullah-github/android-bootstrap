package me.hasham.androidbootstrap.data.api;


import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Developed by Hasham.Tahir on 10/6/2016.
 */

public interface ApiEndpoints {

    String actionPrefix = "?action=";

    @Headers("Content-Type: application/json")
    @POST(actionPrefix + API.ACTION_MENU)
    Call<ResponseBody> getMenu();

    @Multipart
    @POST(actionPrefix + API.ACTION_UPLOAD_USER_IMAGE)
    Call<ResponseBody> uploadProfilePhoto(@Part MultipartBody.Part image,
                                          @Part("uid") RequestBody uid);

}
