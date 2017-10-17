package com.endava.aradisav.android_bc.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.endava.aradisav.android_bc.R;
import com.endava.aradisav.android_bc.model.MyTrack;

import java.util.List;

/**
 * Created by alex on 10/11/17.
 */

public class MyTracksListAdapter extends ArrayAdapter {
    private final Context context;
    private final List<MyTrack> values;

    public MyTracksListAdapter(Context context, List<MyTrack> values) {
        super(context, R.layout.my_tracks_list_item, values);
        this.context = context;
        this.values = values;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.my_tracks_list_item, parent, false);
        TextView name = (TextView) rowView.findViewById(R.id.textView3);
        TextView description = (TextView) rowView.findViewById(R.id.textView4);
        TextView locationCount = (TextView) rowView.findViewById(R.id.textView5);

        name.setText(values.get(position).getName());
        description.setText(values.get(position).getDescription());
        locationCount.setText("" + values.get(position).getLocationList().size() + " location samples");

        return rowView;
    }
}
