package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BodyWeightThursdayWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight_thursday_workout3);

    }

    public void handstandpushups (View view)
    {
        Intent intent = new Intent(this, BodyWeightThursdayWorkout4.class);
        startActivity(intent);
    }
}
