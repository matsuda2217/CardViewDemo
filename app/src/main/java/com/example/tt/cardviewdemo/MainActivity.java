package com.example.tt.cardviewdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listView);
        ArrayList<Integer> images = new ArrayList<Integer>();
        images.add(R.drawable.abc_btn_check_material);
        images.add(R.drawable.abc_list_pressed_holo_dark);
        images.add(R.drawable.ic_launcher);

        CustomAdapter adapter = new CustomAdapter(this, images);
        list.setAdapter(adapter);


    }


}
