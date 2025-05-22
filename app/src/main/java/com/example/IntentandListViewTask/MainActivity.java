package com.example.IntentandListViewTask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    ListView listView;


    String[] androidsNames = {
            "Android 1.0", "Android 1.1", "Cupcake", "Donut", "Eclair",
            "Froyo", "Ginger", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
            "Kitkat", "Lollipop", "Marshmallow", "Nougat", "Oreo",
            "Pie", "Android 10", "Android 11", "Android 12"
    };


    int[] androidsImages = {
            R.drawable.android_1_0,
            R.drawable.android_1_1,
            R.drawable.android_cupcake,
            R.drawable.android_donut,
            R.drawable.android_eclair,
            R.drawable.android_froyo,
            R.drawable.android_gingerbread,
            R.drawable.android_honeycomb,
            R.drawable.android_ice_cream_sandwich,
            R.drawable.android_jelly_bean,
            R.drawable.android_kitkat,
            R.drawable.android_lollipop,
            R.drawable.android_marshmallow,
            R.drawable.android_nougat,
            R.drawable.android_oreo,
            R.drawable.android_pie,
            R.drawable.android_10,
            R.drawable.android_11,
            R.drawable.android_12
    };


    String[] androidSubtitles = {
            "Android 1.0", "Android 1.1", "Cupcake", "Donut", "Eclair", "Froyo",
            "Ginger", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "Kitkat",
            "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "Android 10",
            "Android 11", "Android 12"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);


        com.example.IntentandListViewTask.AndroidAdapter adapter = new com.example.IntentandListViewTask.AndroidAdapter(this, androidsNames, androidsImages);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, AndroidDetailActivity.class);
                intent.putExtra("androidName", androidsNames[position]);
                intent.putExtra("androidImage", androidsImages[position]);
                intent.putExtra("androidSubtitle", androidSubtitles[position]);
                startActivity(intent);
            }
        });
    }
}
