package com.example.admin.tutsall;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CustomCont extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_cont);

        t1 = findViewById(R.id.textView);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/Oswald-Bold.ttf");
        t1.setTypeface(typeface);
    }
}
