package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class LeanThursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_thursday);

    }

    public void overheadpress (View view)
    {
        Intent intent = new Intent(this, LeanThursdayWorkout1.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, LeanThursdayWorkout2.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, LeanThursdayWorkout3.class);
        startActivity(intent);
    }

    public void uprightrow (View view)
    {
        Intent intent = new Intent(this, LeanThursdayWorkout4.class);
        startActivity(intent);
    }

    public void shrugs (View view)
    {
        Intent intent = new Intent(this, LeanThursdayWorkout5.class);
        startActivity(intent);
    }
}
