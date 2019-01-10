package com.example.arcus.footballstats.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    static private RetrofitManager instance;
    private ApiLeagues leagues;

    private RetrofitManager()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.football-data.org/v1/competitions")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        leagues=retrofit.create(ApiLeagues.class);
    }

    public static RetrofitManager getInstance()
    {
        if(instance == null)
        {
            instance = new RetrofitManager();
        }
        return instance;
    }

    public ApiLeagues getLeague()
    {
        return leagues;
    }
}
