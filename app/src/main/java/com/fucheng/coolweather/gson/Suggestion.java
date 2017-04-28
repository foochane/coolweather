package com.fucheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fucheng on 2017/4/28.
 * 建议
 * comf：comfort（舒适度）
 * cw：Car Wash(洗车)
 * sport： 运动
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
