package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BulkTuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_tuesday);

    }

    public void latpulldown (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout1.class);
        startActivity(intent);
    }

    public void seatedrowing (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout2.class);
        startActivity(intent);
    }

    public void dumbellrowing (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout3.class);
        startActivity(intent);
    }

    public void pullups (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout4.class);
        startActivity(intent);
    }

    public void dumbbellcurls (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout5.class);
        startActivity(intent);
    }

    public void barbellcurls  (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout6.class);
        startActivity(intent);
    }

    public void hammercurls (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout7.class);
        startActivity(intent);
    }

    public void concentrationcurls (View view)
    {
        Intent intent = new Intent(this, BulkTuesdayWorkout8.class);
        startActivity(intent);
    }


}
