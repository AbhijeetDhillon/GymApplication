package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class WeightLossMonday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss_monday);

    }
    public void latpulldown (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout1.class);
        startActivity(intent);
    }

    public void seatedrowing(View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout2.class);
        startActivity(intent);
    }

    public void flatdumbbellpress (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossoverfly (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout4.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout5.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout6.class);
        startActivity(intent);
    }

    public void overheadextension (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout7.class);
        startActivity(intent);
    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout8.class);
        startActivity(intent);
    }

    public void dumbbellcurls (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout9.class);
        startActivity(intent);
    }

    public void hammercurls (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout10.class);
        startActivity(intent);
    }

    public void weightedsquats (View view)
    {
        Intent intent = new Intent(this, WeightLossMondayWorkout11.class);
        startActivity(intent);
    }


}
