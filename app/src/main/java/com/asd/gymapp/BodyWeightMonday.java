package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BodyWeightMonday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight_monday);

    }

    public void bwflatpushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightMondayWorkout1.class);
        startActivity(intent);
    }

    public void bwdeclinepushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightMondayWorkout2.class);
        startActivity(intent);
    }

    public void bwinclinepushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightMondayWorkout3.class);
        startActivity(intent);
    }

    public void bwdiamondpushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightMondayWorkout4.class);
        startActivity(intent);
    }

    public void bwtricepdips (View view)
    {
        Intent intent = new Intent(this, BodyWeightMondayWorkout5.class);
        startActivity(intent);
    }

    public void bwtricepextension (View view)
    {
        Intent intent = new Intent(this, BodyWeightMondayWorkout6.class);
        startActivity(intent);
    }
}
