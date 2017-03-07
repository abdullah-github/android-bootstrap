package me.hasham.androidbootstrap.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Today {

    @SerializedName("current_time")
    @Expose
    private String currentTime;
    @SerializedName("temperature")
    @Expose
    private String temperature;
    @SerializedName("date_ur")
    @Expose
    private String dateUr;
    @SerializedName("date_en")
    @Expose
    private String dateEn;
    @SerializedName("weather")
    @Expose
    private Weather weather;
    @SerializedName("today_history")
    @Expose
    private TodayHistory todayHistory;

    /**
     * No args constructor for use in serialization
     */
    public Today() {
    }

    /**
     * @param currentTime
     * @param dateUr
     * @param weather
     * @param todayHistory
     * @param dateEn
     * @param temperature
     */
    public Today(String currentTime, String temperature, String dateUr, String dateEn, Weather weather, TodayHistory todayHistory) {
        this.currentTime = currentTime;
        this.temperature = temperature;
        this.dateUr = dateUr;
        this.dateEn = dateEn;
        this.weather = weather;
        this.todayHistory = todayHistory;
    }

    /**
     * @return The currentTime
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * @param currentTime The current_time
     */
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
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
     * @return The dateUr
     */
    public String getDateUr() {
        return dateUr;
    }

    /**
     * @param dateUr The date_ur
     */
    public void setDateUr(String dateUr) {
        this.dateUr = dateUr;
    }

    /**
     * @return The dateEn
     */
    public String getDateEn() {
        return dateEn;
    }

    /**
     * @param dateEn The date_en
     */
    public void setDateEn(String dateEn) {
        this.dateEn = dateEn;
    }

    /**
     * @return The weather
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * @param weather The weather
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    /**
     * @return The todayHistory
     */
    public TodayHistory getTodayHistory() {
        return todayHistory;
    }

    /**
     * @param todayHistory The today_history
     */
    public void setTodayHistory(TodayHistory todayHistory) {
        this.todayHistory = todayHistory;
    }

}
