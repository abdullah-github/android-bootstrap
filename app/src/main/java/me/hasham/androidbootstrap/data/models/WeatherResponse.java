package me.hasham.androidbootstrap.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherResponse {

    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("response")
    @Expose
    private Today today;

    /**
     * No args constructor for use in serialization
     */
    public WeatherResponse() {
    }

    /**
     * @param action
     * @param today
     * @param meta
     */
    public WeatherResponse(String action, Meta meta, Today today) {
        this.action = action;
        this.meta = meta;
        this.today = today;
    }

    /**
     * @return The action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action The action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * @param meta The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * @return The today
     */
    public Today getToday() {
        return today;
    }

    /**
     * @param today The today
     */
    public void setToday(Today today) {
        this.today = today;
    }

}
