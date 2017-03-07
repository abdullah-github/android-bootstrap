
package me.hasham.androidbootstrap.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Meta {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("android_version")
    @Expose
    private int android_version;

    /**
     * No args constructor for use in serialization
     */
    public Meta() {
    }

    /**
     * @param message
     * @param code
     */
    public Meta(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return The code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public int getAndroid_version() {
        return android_version;
    }

    public void setAndroid_version(int android_version) {
        this.android_version = android_version;
    }
}
