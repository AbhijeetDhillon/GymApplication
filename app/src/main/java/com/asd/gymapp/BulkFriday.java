package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BulkFriday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_friday);

    }

    public void lunges (View view)
    {
        Intent intent = new Intent(this, BulkFridayWorkout1.class);
        startActivity(intent);
    }

    public void weightedsquats (View view)
    {
        Intent intent = new Intent(this, BulkFridayWorkout2.class);
        startActivity(intent);
    }

    public void legpress (View view)
    {
        Intent intent = new Intent(this, BulkFridayWorkout3.class);
        startActivity(intent);
    }
    public void legcurls (View view)
    {
        Intent intent = new Intent(this, BulkFridayWorkout4.class);
        startActivity(intent);
    }
    public void calfraise  (View view)
    {
        Intent intent = new Intent(this, BulkFridayWorkout5.class);
        startActivity(intent);
    }
}
