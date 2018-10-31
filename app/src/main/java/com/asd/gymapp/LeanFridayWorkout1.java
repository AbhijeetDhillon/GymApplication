package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class LeanFridayWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_friday_workout1);

    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, LeanFridayWorkout2.class);
        startActivity(intent);
    }
}
