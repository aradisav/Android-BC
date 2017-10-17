package com.endava.aradisav.android_bc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 10/12/17.
 */

public class MyTrack {
    private List<Location> locationList;
    private String name;
    private String description;

    public MyTrack() {
        name = "Default";
        description = "Default";
        locationList = new ArrayList<>();
    }

    public MyTrack(String name, String description) {
        this.name = name;
        this.description = description;
        locationList = new ArrayList<>();
    }

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
