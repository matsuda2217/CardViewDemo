package com.example.tt.cardviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TT
 */
public class CustomAdapter extends ArrayAdapter<Integer> {
        ArrayList<Integer>  images;
        LayoutInflater layoutInflater;
    public CustomAdapter(Context c, ArrayList<Integer> imgs) {
        super(c, R.layout.single_card,imgs);
        images = imgs;
        layoutInflater =(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        if (convertView == null) {
            vi = layoutInflater.inflate(R.layout.single_card, parent, false);
        }
        TextView textView = (TextView) vi.findViewById(R.id.info_text);
        ImageView imageView = (ImageView) vi.findViewById(R.id.some_mage);
        textView.setText("Number" + position + 1);
        imageView.setImageResource(images.get(position));
        return vi;
    }
}
