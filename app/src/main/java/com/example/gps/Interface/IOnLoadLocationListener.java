package com.example.gps.Interface;

import com.example.gps.MyLatLng;

import java.util.List;

public interface IOnLoadLocationListener {
    void onLocationSuccess(List<MyLatLng> latLngs);
    void onLoadLocationFailed(String message);
}
