package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class LeanWednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_wednesday);

    }

    public void weightedsquats (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout1.class);
        startActivity(intent);
    }
    public void legpress (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout2.class);
        startActivity(intent);
    }
    public void legcurls (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout3.class);
        startActivity(intent);
    }
    public void calfraise (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout4.class);
        startActivity(intent);
    }
    public void crunches (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout5.class);
        startActivity(intent);
    }
    public void legraise (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout6.class);
        startActivity(intent);
    }
    public void plank (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout7.class);
        startActivity(intent);
    }

    public void sideobliques (View view)
    {
        Intent intent = new Intent(this, LeanWednesdayWorkout8.class);
        startActivity(intent);
    }

}
