package com.endava.aradisav.android_bc.repository;

import com.endava.aradisav.android_bc.model.MyTrack;

/**
 * Created by alex on 10/12/17.
 */

public interface MyTrackRepository {
    void save(MyTrack track);
    void delete(MyTrack track);
    void getAllTracks();



}
