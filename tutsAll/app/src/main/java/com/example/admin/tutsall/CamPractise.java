package com.example.admin.tutsall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CamPractise extends AppCompatActivity {

    Button button;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_practise);

        button = findViewById(R.id.button9);
        imageView = findViewById(R.id.imageView9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dispatchImageCaptureIntent();
            }
        });
    }

    private void dispatchImageCaptureIntent() {
        Intent takepicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takepicture.resolveActivity(getPackageManager())!=null){
            startActivityForResult(takepicture, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle extras = data.getExtras();
        Bitmap imageBitmap = (Bitmap)extras.get("data");
        imageView.setImageBitmap(imageBitmap);

    }
}
