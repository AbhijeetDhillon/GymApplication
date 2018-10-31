package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class LeanMonday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_monday);

    }

    public void inclinedumbbellpress (View view)
    {
        Intent intent = new Intent(this, LeanMondayWorkout1.class);
        startActivity(intent);
    }

    public void flatbarbellpress (View view)
    {
        Intent intent = new Intent(this, LeanMondayWorkout2.class);
        startActivity(intent);
    }

    public void declinebarbellpress (View view)
    {
        Intent intent = new Intent(this, LeanMondayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossfly (View view)
    {
        Intent intent = new Intent(this, LeanMondayWorkout4.class);
        startActivity(intent);
    }

    public void pushups (View view)
    {
        Intent intent = new Intent(this, LeanMondayWorkout5.class);
        startActivity(intent);
    }

    public void treadmill (View view)
    {
        Intent intent = new Intent(this, LeanMondayWorkout6.class);
        startActivity(intent);
    }
}

