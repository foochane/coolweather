package com.fucheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fucheng on 2017/4/28.
 * 天气预报
 */

public class Forecast {

    //日期
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    //更多
    @SerializedName("cond")
    public More more;

    public class Temperature{
        //温度最大、最小值
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
