package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TxtAnim;
    Button btnscale, btnTranslate, btnRotation, btnalpha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TxtAnim = findViewById(R.id.TxtAnim);
        btnscale = findViewById(R.id.btnscale);
        btnTranslate= findViewById(R.id.btnTranslate);
        btnRotation = findViewById(R.id.btnRotation);
        btnalpha = findViewById(R.id.btnalpha);



        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                TxtAnim.startAnimation(translate);
            }
        });

        btnalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                        TxtAnim.startAnimation(alpha);
            }
        });

        btnscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                TxtAnim.startAnimation(Scale);
            }
        });

        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Rotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
            }
        });



    }
}