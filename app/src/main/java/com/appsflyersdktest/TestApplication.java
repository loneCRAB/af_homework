package com.appsflyersdktest;

import android.app.Application;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        final String afDevKey = getString(R.string.af_dev_key);
        final AppsFlyerConversionListener conversionListener = new TestAppsFlyerConversationalListener();

        AppsFlyerLib.getInstance().init(afDevKey, conversionListener, getApplicationContext());
        AppsFlyerLib.getInstance().startTracking(this);
    }
}