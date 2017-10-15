package com.endava.aradisav.android_bc.service;

import com.endava.aradisav.android_bc.model.MyTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 10/12/17.
 */

public class MyTracksService {
    private static final MyTracksService ourInstance = new MyTracksService();

    static MyTracksService getInstance() {
        return ourInstance;
    }

    private MyTracksService() {
    }


    public MyTrack createMyTrack(String name, String description){
        MyTrack newTrack = new MyTrack();
        newTrack.setDescription(description);
        newTrack.setName(name);
        return newTrack;
    }


    public List<MyTrack> getListOfMyTracks(){
        List<MyTrack> list = new ArrayList<MyTrack>();
        return list;
    }

    public void saveMyTrack(MyTrack myTrack){


    }


}
