package com.example.ruangdiskusi.models;

import com.google.gson.annotations.SerializedName;

public class Facilities {
    @SerializedName("id")
    private int id;
    @SerializedName("facility1")
    private String facility1;
    @SerializedName("facility2")
    private String facility2;
    @SerializedName("facility3")
    private String facility3;

    public Facilities(int id, String facility1, String facility2, String facility3) {
        this.id = id;
        this.facility1 = facility1;
        this.facility2 = facility2;
        this.facility3 = facility3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacility1() {
        return facility1;
    }

    public void setFacility1(String facility1) {
        this.facility1 = facility1;
    }

    public String getFacility2() {
        return facility2;
    }

    public void setFacility2(String facility2) {
        this.facility2 = facility2;
    }

    public String getFacility3() {
        return facility3;
    }

    public void setFacility3(String facility3) {
        this.facility3 = facility3;
    }
}
