package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class WeightLossTuesdayWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss_tuesday_workout3);

    }
    public void legraise (View view)
    {
        Intent intent = new Intent(this, WeightLossTuesdayWorkout4.class);
        startActivity(intent);
    }
}
