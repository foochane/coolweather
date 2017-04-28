package com.fucheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fucheng on 2017/4/28.
 */

public class Basic {
    /*
     @SerializedName注释方式让JSON字段和java字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
