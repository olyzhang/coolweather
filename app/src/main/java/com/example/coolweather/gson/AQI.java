package com.example.coolweather.gson;

/**
 * Created by 张奥运 on 2017/1/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
