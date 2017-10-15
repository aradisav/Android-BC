package com.endava.aradisav.android_bc.model;

/**
 * Created by alex on 10/12/17.
 */

public class Location {
    private Double latitude;
    private Double longitude;
    private Double altitude;

    public Location(Double latitude, Double longitude, Double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public Location() {
        this.latitude = 0.5;
        this.longitude = 0.5;
        this.altitude = 0d;
    }


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }
}
