package com.tech_reeturaj.retrofit_example_new;

import com.tech_reeturaj.retrofit_example_new.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserOperation {
    @GET("/users")
    Call<List<User>> getAllUsers();
}
