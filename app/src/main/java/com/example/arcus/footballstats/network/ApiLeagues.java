package com.example.arcus.footballstats.network;

import com.example.arcus.footballstats.models.LeaguesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiLeagues {
    @GET("http://api.football-data.org/v1/competitions")
    Call<LeaguesResponse> getLeagues();
}
