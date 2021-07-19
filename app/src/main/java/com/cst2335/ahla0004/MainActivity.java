package com.cst2335.ahla0004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imgView = findViewById(R.id.flagview);
        Switch sw = findViewById(R.id.spin_switch);

        sw.setOnCheckedChangeListener((btn, isChecked) -> {
            //Inside the lambda function body {  }, add an Animation object if the switch is checked:

            if (isChecked) {
                RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(5000);
                rotate.setRepeatCount(Animation.INFINITE);
                rotate.setInterpolator(new LinearInterpolator());

                imgView.startAnimation(rotate);
            } else {
                imgView.clearAnimation();
            }


        });
    }

    }
