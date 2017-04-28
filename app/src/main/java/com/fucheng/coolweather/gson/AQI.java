package com.fucheng.coolweather.gson;

/**
 * Created by fucheng on 2017/4/28.
 *  AQI为空气质量指数
 *  pm2.5
 */

public class AQI {

    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
