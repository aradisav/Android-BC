package com.endava.aradisav.android_bc.service;

import com.endava.aradisav.android_bc.model.MyTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 10/12/17.
 */

public class MyTracksService {
    private static final MyTracksService ourInstance = new MyTracksService();

    static {
        ourInstance.trackList.add(new MyTrack("Track1", "Desc1"));
        ourInstance.trackList.add(new MyTrack("Track2", "Desc2"));
        ourInstance.trackList.add(new MyTrack("Track3", "Desc3"));

    }


    public static MyTracksService getInstance() {
        return ourInstance;
    }

    private MyTracksService() {
        trackList = new ArrayList<MyTrack>();
    }

    private List<MyTrack> trackList;

    public MyTrack createMyTrack(String name, String description) {
        MyTrack newTrack = new MyTrack();
        newTrack.setDescription(description);
        newTrack.setName(name);
        trackList.add(newTrack);
        return newTrack;
    }


    public List<MyTrack> getListOfMyTracks() {
        return trackList;
    }

    public void saveMyTrack(MyTrack myTrack) {
        trackList.add(myTrack);
    }


}
