package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class FitnessMonday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_monday);

    }

    public void latpulldown (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout1.class);
        startActivity(intent);
    }



    public void seatedrowing (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout2.class);
        startActivity(intent);
    }

    public void flatdumbbellpress (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossoverfly (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout4.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout5.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout6.class);
        startActivity(intent);
    }

    public void overheadextension (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout7.class);
        startActivity(intent);
    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout8.class);
        startActivity(intent);
    }

    public void dumbbellcurls (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout9.class);
        startActivity(intent);
    }

    public void hammercurls (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout10.class);
        startActivity(intent);
    }

    public void freesquats (View view)
    {
        Intent intent = new Intent(this, FitnessMondayWorkout11.class);
        startActivity(intent);
    }
}
