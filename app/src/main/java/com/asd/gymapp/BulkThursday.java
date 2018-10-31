package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class BulkThursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_thursday);

    }

    public void overheadpress (View view)
    {
        Intent intent = new Intent(this, BulkThursdayWorkout1.class);
        startActivity(intent);
    }

    public void frontraise (View view)
    {
        Intent intent = new Intent(this, BulkThursdayWorkout2.class);
        startActivity(intent);
    }

    public void lateralraise (View view)
    {
        Intent intent = new Intent(this, BulkThursdayWorkout3.class);
        startActivity(intent);
    }
    public void uprightrow (View view)
    {
        Intent intent = new Intent(this, BulkThursdayWorkout4.class);
        startActivity(intent);
    }
    public void shrugs (View view)
    {
        Intent intent = new Intent(this, BulkThursdayWorkout5.class);
        startActivity(intent);
    }
}
