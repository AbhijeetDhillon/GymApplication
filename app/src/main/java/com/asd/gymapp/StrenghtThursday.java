package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class StrenghtThursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strenght_thursday);

    }

    public void treadmill (View view)
    {
        Intent intent = new Intent(this, StrengthThursdayWorkout1.class);
        startActivity(intent);
    }

    public void crunches (View view)
    {
        Intent intent = new Intent(this, StrengthThursdayWorkout2.class);
        startActivity(intent);
    }

    public void legraise (View view)
    {
        Intent intent = new Intent(this, StrengthThursdayWorkout3.class);
        startActivity(intent);
    }

    public void plank (View view)
    {
        Intent intent = new Intent(this, StrengthThursdayWorkout4.class);
        startActivity(intent);
    }

    public void sideobliques (View view)
    {
        Intent intent = new Intent(this, StrengthThursdayWorkout5.class);
        startActivity(intent);
    }

}
