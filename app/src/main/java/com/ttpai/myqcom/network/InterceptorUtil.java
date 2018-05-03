package com.ttpai.myqcom.network;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

import static com.ttpai.myqcom.util.Const.isDebug;

/**
 * Created by taofa on 2018/5/3.
 * <p>
 * 拦截器工具类
 */

public class InterceptorUtil {
    public static final String TAG = "-----";

    //日志拦截器
    public static HttpLoggingInterceptor loggingInterceptor() {
        return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                if (isDebug)
                    Log.e(TAG, "log" + message);
            }
        }).setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    public static Interceptor HeaderInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                //在这里你可以做一些想做的事,比如token失效时,重新获取token
                //或者添加header等等
                return chain.proceed(request);
            }
        };
    }
}
