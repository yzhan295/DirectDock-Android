package com.direct.dock.service;

import android.util.Log;

import com.direct.dock.common.http.HttpClient;
import com.direct.dock.common.http.HttpResponseHandler;

/**
 * Created by ESG020 on 2017/11/14.
 */

public class VehicleControlService {
    private static final String TAG = VehicleControlService.class.getName();
    private static final String HTTP_DOMAIN = "http://192.168.188.143:8888";

    public void queryVehicleData(HttpResponseHandler httpResponseHandler) {

        String url = "http://120.25.236.132:88/myford-poc/api/feedback/listAll";//HTTP_DOMAIN + "/query_vehicle_data";
        Log.d(TAG, url);
        HttpClient.get(url, null, httpResponseHandler);
    }
}
