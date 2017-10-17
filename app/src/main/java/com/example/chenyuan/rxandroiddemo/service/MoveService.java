package com.example.chenyuan.rxandroiddemo.service;

import com.example.chenyuan.rxandroiddemo.entity.AddressBean;
import com.example.chenyuan.rxandroiddemo.entity.UserBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by chenyuan  on 2017/10/14.
 */

public interface MoveService {
    @GET("User/UserInfor")
    Call<UserBean> getUserInfo();

    @GET("AddressBooks")
    Call<List<AddressBean>> getAddressList(@Query("communityId") int communityId, @Query("status") String status);


}
