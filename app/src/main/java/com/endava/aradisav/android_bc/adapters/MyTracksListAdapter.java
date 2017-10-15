package com.endava.aradisav.android_bc.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.endava.aradisav.android_bc.R;

/**
 * Created by alex on 10/11/17.
 */

public class MyTracksListAdapter extends ArrayAdapter {
    private final Context context;
    private final String[] values;

    public MyTracksListAdapter(Context context, String[] values) {
        super(context, R.layout.my_tracks_list_item, values);
        this.context = context;
        this.values = values;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.my_tracks_list_item, parent, false);
        TextView textView3 = (TextView) rowView.findViewById(R.id.textView3);
        TextView textView4 = (TextView) rowView.findViewById(R.id.textView4);
        TextView textView5 = (TextView) rowView.findViewById(R.id.textView3);


        textView3.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        return rowView;
    }
}
