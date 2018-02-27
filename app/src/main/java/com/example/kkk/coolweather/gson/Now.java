package com.example.kkk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by k on 2018/2/27.
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
