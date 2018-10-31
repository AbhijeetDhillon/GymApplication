package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BodyWeightFriday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight_friday);

    }

    public void bwsquats (View view)
    {
        Intent intent = new Intent(this, BodyWeightFridayWorkout1.class);
        startActivity(intent);
    }

    public void bwlunges (View view)
    {
        Intent intent = new Intent(this, BodyWeightFridayWorkout2.class);
        startActivity(intent);
    }

    public void bwcalfraises (View view)
    {
        Intent intent = new Intent(this, BodyWeightFridayWorkout3.class);
        startActivity(intent);
    }
}
