package com.fucheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fucheng on 2017/4/28.
 * 当前的温度和天气情况
 * tmp：temperature（温度）
 * cond：condition（天气状况）
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
