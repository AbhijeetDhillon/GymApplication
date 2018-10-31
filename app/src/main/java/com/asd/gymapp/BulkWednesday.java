package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BulkWednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_wednesday);

    }

    public void treadmill (View view)
    {
        Intent intent = new Intent(this, BulkWedenesdayWorkout1.class);
        startActivity(intent);
    }

    public void crunches (View view)
    {
        Intent intent = new Intent(this, BulkWednesdayWorkout2.class);
        startActivity(intent);
    }

    public void legraise (View view)
    {
        Intent intent = new Intent(this, BulkWednesdayWorkout3.class);
        startActivity(intent);
    }

    public void plank (View view)
    {
        Intent intent = new Intent(this, BulkWednesdayWorkout4.class);
        startActivity(intent);
    }

    public void sideobilques  (View view)
    {
        Intent intent = new Intent(this, BulkWednesdayWorkout5.class);
        startActivity(intent);
    }
}
