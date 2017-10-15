package com.endava.aradisav.android_bc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.endava.aradisav.android_bc.adapters.MyTracksListAdapter;

public class MyTracks extends AppCompatActivity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tracks);

        ArrayAdapter adapter = new MyTracksListAdapter(this, mobileArray);

        ListView listView = (ListView) findViewById(R.id.myTracksListView);
        listView.setAdapter(adapter);
    }
}
