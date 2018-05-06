package com.example.admin.tutsall;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageView;

public class AnimationViewLearn extends AppCompatActivity {
    private ImageView imageView, imageView2, imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_view_learn);
         imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

    }

    public void onButtonClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.grow);
        imageView.startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.setScaleX(2);
                imageView.setScaleY(2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageView2.animate()
                .scaleX(2)
                .scaleY(2)
                .setDuration(2000);

        imageView3.animate()
                .translationX(200)  // in dp
                .setDuration(2000);

        ValueAnimator animator = ValueAnimator.ofFloat(1f, 20f)
                .setDuration(2000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

            }
        });
        animator.setRepeatCount(2);  //3 times  // value animator.infinite can be used here
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();

        // object animator is different from value animator
        ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(imageView4, "scaleX",1f,2f)
                    .setDuration(1000);
        //objectAnimatorX.start();
        objectAnimatorX.setInterpolator(new AnticipateOvershootInterpolator());
        ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(imageView4, "scaleY",1f,2f)
                .setDuration(1000);
        //objectAnimatorY.start();

        AnimatorSet set = new AnimatorSet();
        set.playTogether(objectAnimatorX, objectAnimatorY);
        set.start();

//        set.playSequentially(objectAnimatorX,objectAnimatorY);
//        set.start();

    }
}
