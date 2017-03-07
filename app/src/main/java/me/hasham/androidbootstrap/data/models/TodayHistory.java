package me.hasham.androidbootstrap.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TodayHistory {

    @SerializedName("nid")
    @Expose
    private String nid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("field_today_date_value")
    @Expose
    private String fieldTodayDateValue;

    /**
     * No args constructor for use in serialization
     */
    public TodayHistory() {
    }

    /**
     * @param title
     * @param fieldTodayDateValue
     * @param status
     * @param nid
     */
    public TodayHistory(String nid, String title, String status, String fieldTodayDateValue) {
        this.nid = nid;
        this.title = title;
        this.status = status;
        this.fieldTodayDateValue = fieldTodayDateValue;
    }

    /**
     * @return The nid
     */
    public String getNid() {
        return nid;
    }

    /**
     * @param nid The nid
     */
    public void setNid(String nid) {
        this.nid = nid;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The fieldTodayDateValue
     */
    public String getFieldTodayDateValue() {
        return fieldTodayDateValue;
    }

    /**
     * @param fieldTodayDateValue The field_today_date_value
     */
    public void setFieldTodayDateValue(String fieldTodayDateValue) {
        this.fieldTodayDateValue = fieldTodayDateValue;
    }

}
