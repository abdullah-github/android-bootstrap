package me.hasham.androidbootstrap.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("utc_offset")
    @Expose
    private String utcOffset;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("geoid")
    @Expose
    private String geoid;
    @SerializedName("temperature")
    @Expose
    private String temperature;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    /**
     * No args constructor for use in serialization
     */
    public Weather() {
    }

    /**
     * @param imageUrl
     * @param condition
     * @param name
     * @param utcOffset
     * @param geoid
     * @param temperature
     */
    public Weather(String utcOffset, String name, String geoid, String temperature, String condition, String imageUrl) {
        this.utcOffset = utcOffset;
        this.name = name;
        this.geoid = geoid;
        this.temperature = temperature;
        this.condition = condition;
        this.imageUrl = imageUrl;
    }

    /**
     * @return The utcOffset
     */
    public String getUtcOffset() {
        return utcOffset;
    }

    /**
     * @param utcOffset The utc_offset
     */
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The geoid
     */
    public String getGeoid() {
        return geoid;
    }

    /**
     * @param geoid The geoid
     */
    public void setGeoid(String geoid) {
        this.geoid = geoid;
    }

    /**
     * @return The temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature The temperature
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * @return The condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition The condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * @return The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
