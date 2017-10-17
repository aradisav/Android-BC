package com.endava.aradisav.android_bc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.endava.aradisav.android_bc.adapters.MyTracksListAdapter;
import com.endava.aradisav.android_bc.model.MyTrack;
import com.endava.aradisav.android_bc.service.MyTracksService;

import java.util.List;

public class MyTracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tracks);

        List<MyTrack> list = MyTracksService.getInstance().getListOfMyTracks();


        ArrayAdapter adapter = new MyTracksListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.myTracksListView);
        listView.setAdapter(adapter);

        if (list.size() > 0) {
            listView.setVisibility(View.VISIBLE);
            findViewById(R.id.textView2).setVisibility(View.GONE);
        }

    }
}
