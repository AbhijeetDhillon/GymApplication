package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BodyWeightThursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight_thursday);

    }

    public void shoulderpress (View view)
    {
        Intent intent = new Intent(this, BodyWeightThursdayWorkout1.class);
        startActivity(intent);
    }

    public void widepushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightThursdayWorkout2.class);
        startActivity(intent);
    }

    public void handstandpushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightThursdayWorkout3.class);
        startActivity(intent);
    }

    public void declinepushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightThursdayWorkout4.class);
        startActivity(intent);
    }
}
