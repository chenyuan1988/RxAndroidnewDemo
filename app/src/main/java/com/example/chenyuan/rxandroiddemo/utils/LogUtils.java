package com.example.chenyuan.rxandroiddemo.utils;

import android.util.Log;

/**
 * Created by chenyuan  on 2017/10/14.
 */

public class LogUtils {
    public static void e(String message) {
        Log.e("rxandroid", message);
    }

    public static void e(String tag, String message) {
        Log.e(tag, message);
    }
}
