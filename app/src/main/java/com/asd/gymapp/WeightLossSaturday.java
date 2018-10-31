package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class WeightLossSaturday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss_saturday);

    }

    public void latpulldown (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout1.class);
        startActivity(intent);
    }

    public void seatedrowing(View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout2.class);
        startActivity(intent);
    }

    public void flatdumbbellpress (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossoverfly (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout4.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout5.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout6.class);
        startActivity(intent);
    }

    public void overheadextension (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout7.class);
        startActivity(intent);
    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout8.class);
        startActivity(intent);
    }

    public void dumbbellcurls (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout9.class);
        startActivity(intent);
    }

    public void hammercurls (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout10.class);
        startActivity(intent);
    }

    public void weightedsquats (View view)
    {
        Intent intent = new Intent(this, WeightLossSaturdayWorkout11.class);
        startActivity(intent);
    }

}
