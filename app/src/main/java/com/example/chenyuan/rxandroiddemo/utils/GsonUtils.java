package com.example.chenyuan.rxandroiddemo.utils;

import android.text.TextUtils;

import com.google.gson.Gson;

/**
 * Created by chenyuan  on 2017/10/17.
 */

public class GsonUtils {
    public static Gson mGson;

    static {
        if (mGson == null) {
            mGson = new Gson();
        }
    }


    /*
    * 对象转换成json字符串
    * */
    public static String ObjectToGsonStr(Object object) {
        String jsonStr = null;
        if (object != null) {
            jsonStr = mGson.toJson(object);
        }
        return jsonStr;
    }

    public static <T extends Object> T jsonToBean(String json, Class aClass) {
        Object object = null;

        if (mGson != null) {
            if (TextUtils.isEmpty(json)) {
                object = mGson.fromJson(json, aClass);
            }
        }
        return (T) object;
    }

}
