package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BulkMonday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_monday);

    }

    public void declinedumbbellpress (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout1.class);
        startActivity(intent);
    }
    public void inclinedumbbellpress (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout2.class);
        startActivity(intent);
    }

    public void flatdumbbellpress (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout3.class);
        startActivity(intent);
    }

    public void cablecrossoverfly (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout4.class);
        startActivity(intent);
    }
    public void pushups  (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout5.class);
        startActivity(intent);
    }

    public void barpushdown (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout6.class);
        startActivity(intent);
    }

    public void overhead (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout7.class);
        startActivity(intent);
    }

    public void ropepushdown (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout8.class);
        startActivity(intent);
    }

    public void tricepdips (View view)
    {
        Intent intent = new Intent(this, BulkMondayWorkout9.class);
        startActivity(intent);
    }


}
