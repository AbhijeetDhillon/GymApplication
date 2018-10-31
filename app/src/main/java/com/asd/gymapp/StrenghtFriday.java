package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;

public class StrenghtFriday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strenght_friday);

    }
    public void weightedsquats  (View view)
    {
        Intent intent = new Intent(this, StrengthFridayWorkout1.class);
        startActivity(intent);
    }

    public void declinebarbellpress  (View view)
    {
        Intent intent = new Intent(this, StrengthFridayWorkout2.class);
        startActivity(intent);
    }

    public void hammerrowing (View view)
    {
        Intent intent = new Intent(this, StrengthFridayWorkout3.class);
        startActivity(intent);
    }

    public void tricepdips  (View view)
    {
        Intent intent = new Intent(this, StrengthFridayWorkout4.class);
        startActivity(intent);
    }

    public void Dumbbellcurls  (View view)
    {
        Intent intent = new Intent(this, StrengthFridayWorkout5.class);
        startActivity(intent);
    }
}
