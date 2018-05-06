package com.example.admin.tutsall;

import android.graphics.Matrix;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.Toast;

public class GesGestureGes extends AppCompatActivity {
    private ImageView iv;
    private Matrix matrix = new Matrix();
    private float scale = 1f;
    private ScaleGestureDetector SGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ges_gesture_ges);

        iv = findViewById(R.id.imageView5);

        SGD = new ScaleGestureDetector(this,new ScaleListener());
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = MotionEventCompat.getActionMasked(ev);
        switch (action){
            case (MotionEvent.ACTION_DOWN) :
                Toast.makeText(getApplicationContext(), "down", Toast.LENGTH_SHORT).show();
                return true;
            case (MotionEvent.ACTION_MOVE):
                Toast.makeText(getApplicationContext(), "move", Toast.LENGTH_SHORT).show();
                return true;
            case (MotionEvent.ACTION_CANCEL):
                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();
                return true;
            case (MotionEvent.ACTION_UP):
                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();
                return true;
            case (MotionEvent.ACTION_OUTSIDE):
                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onTouchEvent(ev);
        }

    }

    private class ScaleListener extends ScaleGestureDetector.
            SimpleOnScaleGestureListener {

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *= detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5.0f));
            matrix.setScale(scale, scale);
            iv.setImageMatrix(matrix);
            return true;
        }
    }
}
