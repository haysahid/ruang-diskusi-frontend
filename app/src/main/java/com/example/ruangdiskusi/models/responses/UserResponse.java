package com.example.ruangdiskusi.models.responses;

import com.example.ruangdiskusi.models.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponse {
    @SerializedName("message")
    private String message;
    @SerializedName("total_result")
    private int total_result;
    @SerializedName("data")
    private List<User> data;

    public UserResponse(String message, int total_result, List<User> data) {
        this.message = message;
        this.total_result = total_result;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal_result() {
        return total_result;
    }

    public void setTotal_result(int total_result) {
        this.total_result = total_result;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
