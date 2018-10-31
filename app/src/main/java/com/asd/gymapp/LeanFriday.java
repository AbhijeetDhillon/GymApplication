package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class LeanFriday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_friday);

    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout1.class);
        startActivity(intent);
    }

    public void overheadextension (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout2.class);
        startActivity(intent);
    }

    public void ropepushdown (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout3.class);
        startActivity(intent);
    }

    public void tricepdips (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout4.class);
        startActivity(intent);
    }

    public void crunches (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout5.class);
        startActivity(intent);
    }

    public void legraise (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout6.class);
        startActivity(intent);
    }

    public void plank (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout7.class);
        startActivity(intent);
    }
}
