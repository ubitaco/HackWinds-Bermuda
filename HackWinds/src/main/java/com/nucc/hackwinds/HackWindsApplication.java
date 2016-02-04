package com.nucc.hackwinds;


import android.app.Application;

import com.nucc.hackwinds.models.BuoyModel;
import com.nucc.hackwinds.models.ForecastModel;
import com.nucc.hackwinds.models.TideModel;

public class HackWindsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ForecastModel.getInstance(this).fetchForecastData();
        BuoyModel.getInstance(this).fetchBuoyData();
        TideModel.getInstance(this).fetchTideData();
    }
}