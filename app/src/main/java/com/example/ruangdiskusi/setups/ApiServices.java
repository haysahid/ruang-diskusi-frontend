package com.example.ruangdiskusi.setups;

import com.example.ruangdiskusi.models.Rooms;
import com.example.ruangdiskusi.models.User;
import com.example.ruangdiskusi.models.responses.RoomResponses;
import com.example.ruangdiskusi.models.responses.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiServices {
    // Authentication
    @POST("Api/Login")
    Call<UserResponse> login(User user);

    // Room
    @GET("Api/Rooms")
    Call<RoomResponses> getAllRoom(@Query("jwt_token") String jwtToken);
    @PUT("Api/Rooms")
    Call<RoomResponses> updateStatus(
            @Query("jwt_token") String jwtToken,
            Rooms rooms
    );

}
