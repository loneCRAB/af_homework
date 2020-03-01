package com.appsflyersdktest;

import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;

import java.util.Map;

public class TestAppsFlyerConversationalListener implements AppsFlyerConversionListener {

    @Override
    public void onConversionDataSuccess(Map<String, Object> conversionData) {

        for (String attrName : conversionData.keySet()) {
            Log.d("LOG_TAG", "attribute: " + attrName + " = " + conversionData.get(attrName));
        }
    }

    @Override
    public void onConversionDataFail(String errorMessage) {
        Log.d("LOG_TAG", "error getting conversion data: " + errorMessage);
    }

    @Override
    public void onAppOpenAttribution(Map<String, String> conversionData) {

        for (String attrName : conversionData.keySet()) {
            Log.d("LOG_TAG", "attribute: " + attrName + " = " + conversionData.get(attrName));
        }

    }

    @Override
    public void onAttributionFailure(String errorMessage) {
        Log.d("LOG_TAG", "error onAttributionFailure : " + errorMessage);
    }
}