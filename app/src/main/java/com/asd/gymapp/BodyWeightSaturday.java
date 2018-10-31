package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BodyWeightSaturday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight_saturday);

    }

    public void jogging (View view)
    {
        Intent intent = new Intent(this, BodyWeightSaturdayWorkout1.class);
        startActivity(intent);
    }

    public void crunches (View view)
    {
        Intent intent = new Intent(this, BodyWeightSaturdayWorkout2.class);
        startActivity(intent);
    }

    public void legraise (View view)
    {
        Intent intent = new Intent(this, BodyWeightSaturdayWorkout3.class);
        startActivity(intent);
    }

    public void plank (View view)
    {
        Intent intent = new Intent(this, BodyWeightSaturdayWorkout4.class);
        startActivity(intent);
    }
}
