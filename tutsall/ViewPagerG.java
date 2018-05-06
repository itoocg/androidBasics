package com.example.admin.tutsall;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_g);

        ViewPager viewPagerG =  findViewById(R.id.viewpager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPagerG.setAdapter(adapter);
    }
}
