package com.bely.androidmediaplayer.shared;

import android.app.Application;
import android.content.Context;
import android.content.Intent;



public class KongPlayerApplication extends Application {

    private static Context mContext;
    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
//        Intent intent = new Intent();
//        intent.setClass(this, MyMusicService.class);
//        startService(intent);
    }
}
