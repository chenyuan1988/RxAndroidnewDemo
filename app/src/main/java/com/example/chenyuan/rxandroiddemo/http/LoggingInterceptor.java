package com.example.chenyuan.rxandroiddemo.http;

import com.example.chenyuan.rxandroiddemo.utils.LogUtils;

import java.io.IOException;
import java.net.URLDecoder;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by chenyuan  on 2017/10/17.
 */

public class LoggingInterceptor implements Interceptor {
    private static final String TAG = LoggingInterceptor.class.getName();

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long startTime = System.currentTimeMillis();
        okhttp3.Response response = chain.proceed(chain.request());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        okhttp3.MediaType mediaType = response.body().contentType();
        String content = response.body().string();
        LogUtils.e(TAG, "\n");
        LogUtils.e(TAG, "----------Start----------------");
        LogUtils.e(TAG, "| " + request.toString());
        String method = request.method();
        if ("POST".equals(method)) {
            StringBuilder sb = new StringBuilder();
            if (request.body() instanceof FormBody) {
                FormBody body = (FormBody) request.body();
                for (int i = 0; i < body.size(); i++) {
                    sb.append(body.encodedName(i) + "=" + body.encodedValue(i) + ",");
                }
                sb.delete(sb.length() - 1, sb.length());
                LogUtils.e(TAG, "| RequestParams:{" + URLDecoder.decode(sb.toString(), "UTF-8") + "}");
            }
        } else if ("GET".equals(method)) {
            //ToDo
        }
        LogUtils.e(TAG, "| Response:" + content);
        LogUtils.e(TAG, "----------End:" + duration + "ms----------");
        return response.newBuilder().body(okhttp3.ResponseBody.create(mediaType, content)).build();
    }
}
