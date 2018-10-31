package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class WeightLossWednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss_wednesday);

    }
    public void latpulldown (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout1.class);
        startActivity(intent);
    }

    public void seatedrowing(View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout2.class);
        startActivity(intent);
    }

    public void flatdumbbellpress (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossoverfly (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout4.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout5.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout6.class);
        startActivity(intent);
    }

    public void overheadextension (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout7.class);
        startActivity(intent);
    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout8.class);
        startActivity(intent);
    }

    public void dumbbellcurls (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout9.class);
        startActivity(intent);
    }

    public void hammercurls (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout10.class);
        startActivity(intent);
    }

    public void weightedsquats (View view)
    {
        Intent intent = new Intent(this, WeightLossWednesdayWorkout11.class);
        startActivity(intent);
    }

}
