package me.hasham.androidbootstrap.data.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Developed by Hasham.Tahir on 10/6/2016.
 */

public class API {

    public static final String ACTION_MENU = "menu";
    public static final String ACTION_UPLOAD_USER_IMAGE = "upload_user_image";

    public static Map<String, String> getFeedParams(int pageNumber, String limit) {

        Map<String, String> params = new HashMap<>();
        params.put("page", pageNumber + "");
        params.put("limit", limit);

        return params;
    }
}
