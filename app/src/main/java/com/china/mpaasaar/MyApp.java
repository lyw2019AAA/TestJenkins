package com.china.mpaasaar;

import android.app.Application;
import android.content.Context;

import com.alipay.mobile.framework.quinoxless.IInitCallback;
import com.alipay.mobile.framework.quinoxless.QuinoxlessFramework;

public class MyApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        QuinoxlessFramework.setup(this, new IInitCallback() {
            @Override
            public void onPostInit() {
                // 在这里开始使用 mPaaS 功能
            }
        });
    }

    @Override
    public void onCreate() {
        super.onCreate();
        QuinoxlessFramework.init();
    }
}
