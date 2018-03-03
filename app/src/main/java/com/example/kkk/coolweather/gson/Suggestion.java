package com.example.kkk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by k on 2018/2/27.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    @SerializedName("trav")
    public Travel travel;

    public Flu flu;

    //z
    @SerializedName("drsg")
    public Dress dress;

    public Uv uv;

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

    public class Dress{
        @SerializedName("txt")
        public String info;
    }

    public class Flu{
        @SerializedName("txt")
        public String info;
    }

    public class Travel{
        @SerializedName("txt")
        public String info;
    }

    public class Uv{
        @SerializedName("txt")
        public String info;
    }
}
