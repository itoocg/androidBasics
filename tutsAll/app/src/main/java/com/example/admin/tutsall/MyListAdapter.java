package com.example.admin.tutsall;

import android.app.Activity;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid) {
        super(context, R.layout.mylist, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView titleText =  rowView.findViewById(R.id.title);
        ImageView imageView = rowView.findViewById(R.id.icon);
        TextView subtitleText =  rowView.findViewById(R.id.subtitle);

        titleText.setText(maintitle[position]);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "font/Oswald-Light.ttf");
        titleText.setTypeface(typeface);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        subtitleText.setTypeface(typeface);

        return rowView;

    }
}