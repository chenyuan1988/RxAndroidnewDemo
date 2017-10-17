package com.example.chenyuan.rxandroiddemo.http;

import com.example.chenyuan.rxandroiddemo.config.Constant;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chenyuan  on 2017/10/14.
 */

public class HttpApi {
    private static HttpApi mHttpApi;
    private final Retrofit mMRetrofit;

    public static HttpApi getInstanec() {
        if (mHttpApi == null) {
            synchronized (HttpApi.class) {
                if (mHttpApi == null) {
                    mHttpApi = new HttpApi();
                }
            }
        }
        return mHttpApi;
    }

    private HttpApi() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor())
                .build();
        mMRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(Constant.RELEASE_BESEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public <T> T create(final Class<T> service) {
        return mMRetrofit.create(service);
    }

}
