package com.example.admin.tutsall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class LayoutTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_test);
/*
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater(int resource, ViewGroup parent);
        // resource = name of xml layout file thaat you want to inflate
        //parent = a layout that you would use as a parent for v in the ViewHeirarchy

        inflater(R.layout.sublayout, null); // parent is optional

        what is v? the root View representing resource
                is textview in sublayout then v is textview, and if linear layout and textview in sublayout then v is linear layout

                */

        // LayoutParams is the paraments of layout like width height orientation etc

        /*
        View v = inflater.inflate(R.layout.sublayout, linear);
        exp textview becomes child of linear layout parent
         */

        /*
        //true
        View v = inflater.inflate(R.layout.sublayout, linear, true);
        true is 3rd parameter called attachToRoot which means sublayout should be inflated and made a part of the parent linear
        automatically added to linear layout so need not to call add view
         */

        /*
        in 4th if we do false in inflater ... text view will not be parent of linear but will have it's params
         */
    }
}
