package com.endava.aradisav.android_bc.model;

import com.endava.aradisav.android_bc.model.Location;

import java.util.List;

/**
 * Created by alex on 10/12/17.
 */

public class MyTrack {
    List<Location> locationList;
    String name;
    String description;


    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
