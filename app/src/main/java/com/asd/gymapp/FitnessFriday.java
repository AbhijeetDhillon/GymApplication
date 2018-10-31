package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class FitnessFriday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_friday);

    }

    public void latpulldown (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout1.class);
        startActivity(intent);
    }



    public void seatedrowing (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout2.class);
        startActivity(intent);
    }

    public void flatdumbbellpress (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossoverfly (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout4.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout5.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout6.class);
        startActivity(intent);
    }

    public void overheadextension (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout7.class);
        startActivity(intent);
    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout8.class);
        startActivity(intent);
    }

    public void dumbbellcurls (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout9.class);
        startActivity(intent);
    }

    public void hammercurls (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout10.class);
        startActivity(intent);
    }

    public void weightedsquats (View view)
    {
        Intent intent = new Intent(this, FitnessFridayWorkout11.class);
        startActivity(intent);
    }
}
