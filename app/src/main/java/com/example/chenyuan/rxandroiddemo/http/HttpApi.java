package com.example.chenyuan.rxandroiddemo.http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chenyuan  on 2017/10/14.
 */

public class HttpApi {
    public static final String BASE_URL = "https://api.douban.com/v2/movie/";

    private static final HttpApi ourInstance = new HttpApi();
    private final Retrofit mRetrofit;

    public static HttpApi getInstance() {
        return ourInstance;
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

    private HttpApi() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <T> T create(final Class<T> service) {
        return mRetrofit.create(service);
    }
}
