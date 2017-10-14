package com.example.chenyuan.rxandroiddemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        callMethod();

    }


    public void callMethod(){

       /* call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                    if (response.isSuccessful()){
                        String toString = response.body().toString();
                        LogUtils.e(toString);
                    }

            }
        });
*/
    }
}
