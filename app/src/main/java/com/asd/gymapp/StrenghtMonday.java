package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class StrenghtMonday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strenght_monday);

    }

    public void weightedsquats  (View view)
    {
        Intent intent = new Intent(this, StrengthMondayWorkout1.class);
        startActivity(intent);
    }

    public void flatbarbellpress  (View view)
    {
        Intent intent = new Intent(this, StrengthMondayWorkout2.class);
        startActivity(intent);
    }

    public void hammerrowing  (View view)
    {
        Intent intent = new Intent(this, StrengthMondayWorkout3.class);
        startActivity(intent);
    }

    public void barbellcurls  (View view)
    {
        Intent intent = new Intent(this, StrengthMondayWorkout4.class);
        startActivity(intent);
    }

    public void barpushdown  (View view)
    {
        Intent intent = new Intent(this, StrengthMondayWorkout5.class);
        startActivity(intent);
    }
}
