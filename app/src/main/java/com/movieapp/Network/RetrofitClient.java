package com.movieapp.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String base_url="https://api.themoviedb.org/3/";
    private static  Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        if (retrofit == null) {
            retrofit=new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
