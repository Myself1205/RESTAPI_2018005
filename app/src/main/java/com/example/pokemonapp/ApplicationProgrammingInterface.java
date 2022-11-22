package com.example.assassinapp;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApplicationProgrammingInterface {
    String BASE_URL = "https://assaapi.co/api/v2/";
    @GET("assassin?limit=10")
    Call<AssassinNation> getAssassins();
}
