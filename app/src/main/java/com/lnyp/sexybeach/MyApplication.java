package com.lnyp.sexybeach;

import android.app.Application;

import com.apkfuns.logutils.LogUtils;
import com.lnyp.sexybeach.util.ImageLoaderUtil;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoaderUtil.init(this);


        LogUtils.configAllowLog = true;
        LogUtils.configTagPrefix = "sexybeach-";

    }
}