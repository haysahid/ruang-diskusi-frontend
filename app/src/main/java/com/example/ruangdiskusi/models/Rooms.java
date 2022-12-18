package com.example.ruangdiskusi.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rooms {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("facilities")
    private List<Facilities> facilities;
    @SerializedName("status")
    private boolean status;

    public Rooms(int id, String name, List<Facilities> facilities, boolean status) {
        this.id = id;
        this.name = name;
        this.facilities = facilities;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Facilities> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facilities> facilities) {
        this.facilities = facilities;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
