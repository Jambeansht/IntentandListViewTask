package com.example.guidedexercise3;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.guidedexercise3.R;

public class AndroidAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] androidsNames;
    private final int[] androidsImages;


    //    private final String[] citySubtitles;
    public AndroidAdapter(Activity context, String[] androidsNames, int[] androidsImages) {
        super(context, R.layout.list_item, androidsNames);
        this.context = context;
        this.androidsNames = androidsNames;
        this.androidsImages = androidsImages;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);


        TextView titleText = rowView.findViewById(R.id.androidNameText);
        ImageView imageView = rowView.findViewById(R.id.androidImage);


        titleText.setText(androidsNames[position]);
        imageView.setImageResource(androidsImages[position]);


        return rowView;
    }
}