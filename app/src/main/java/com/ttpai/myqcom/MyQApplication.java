package com.ttpai.myqcom;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by taofa on 2018/5/3.
 */

public class MyQApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
