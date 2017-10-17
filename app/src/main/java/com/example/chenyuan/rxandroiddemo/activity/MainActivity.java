package com.example.chenyuan.rxandroiddemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.chenyuan.rxandroiddemo.entity.AddressBean;
import com.example.chenyuan.rxandroiddemo.http.HttpApi;
import com.example.chenyuan.rxandroiddemo.service.MoveService;
import com.example.chenyuan.rxandroiddemo.utils.LogUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        callMethod();

    }


    public void callMethod() {
        MoveService service = HttpApi.getInstanec().create(MoveService.class);
        Call<List<AddressBean>> call = service.getAddressList(1993, "0");
        call.enqueue(new Callback<List<AddressBean>>() {
            @Override
            public void onResponse(Call<List<AddressBean>> call, Response<List<AddressBean>> response) {
                if (response.isSuccessful()){
                    List<AddressBean> list = response.body();
                }
            }

            @Override
            public void onFailure(Call<List<AddressBean>> call, Throwable t) {
                LogUtils.e("请求失败!");
            }
        });

    }

}
