package com.example.mtustack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {

Animation zoom;
ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        img = findViewById(R.id.image);
        img.startAnimation(zoom);

        Handler h = new Handler();


        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashscreen.this, onboard.class);
                startActivity(i);
                finish();

            }
        }, 4000);








    }
}