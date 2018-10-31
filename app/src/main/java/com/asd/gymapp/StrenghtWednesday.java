package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class StrenghtWednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strenght_wednesday);

    }

    public void legpress (View view)
    {
        Intent intent = new Intent(this, StrengthWednesdayWorkout1.class);
        startActivity(intent);
    }

    public void militarypress (View view)
    {
        Intent intent = new Intent(this, StrengthWednesdayWorkout2.class);
        startActivity(intent);
    }

    public void deadlift (View view)
    {
        Intent intent = new Intent(this, StrengthWednesdayWorkout3.class);
        startActivity(intent);
    }

    public void pullups (View view)
    {
        Intent intent = new Intent(this, StrengthWednesdayWorkout4.class);
        startActivity(intent);
    }

    public void barbellcurls (View view)
    {
        Intent intent = new Intent(this, StrengthWednesdayWorkout5.class);
        startActivity(intent);
    }
}
