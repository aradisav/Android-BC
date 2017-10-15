package com.endava.aradisav.android_bc.service;

/**
 * Created by alex on 10/12/17.
 */

class MyTrackServiceSingleton {
    private static final MyTrackServiceSingleton ourInstance = new MyTrackServiceSingleton();

    static MyTrackServiceSingleton getInstance() {
        return ourInstance;
    }

    private MyTrackServiceSingleton() {
    }
}
