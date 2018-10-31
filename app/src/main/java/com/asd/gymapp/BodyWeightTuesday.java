package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BodyWeightTuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight_tuesday);

    }

    public void pullups (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout1.class);
        startActivity(intent);
    }


    public void superman (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout2.class);
        startActivity(intent);
    }


    public void starplank (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout3.class);
        startActivity(intent);
    }


    public void elbowlifts (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout4.class);
        startActivity(intent);
    }


    public void chinups (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout5.class);
        startActivity(intent);
    }


    public void doorframerows (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout6.class);
        startActivity(intent);
    }


    public void pseudoplance (View view)
    {
        Intent intent = new Intent(this, BodyWeightTuesdayWorkout7.class);
        startActivity(intent);
    }
}
