package com.example.kkk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by k on 2018/2/27.
 */

public class Basic {

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
