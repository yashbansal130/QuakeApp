package com.example.android.quakereport;

public class EarthQuake {

    private double  mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;
    private String mUrl;

    public EarthQuake(double magnitude, String location, long time, String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliSeconds=time;
        mUrl=url;
    }
    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public Long getTime(){
        return mTimeInMilliSeconds;
    }
    public String getUrl(){
        return mUrl;
    }
}
