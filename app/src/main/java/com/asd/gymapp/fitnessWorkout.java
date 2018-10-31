package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class fitnessWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_workout);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    public void fitnessmonday(View view) {
        Intent intent = new Intent(this, FitnessMonday.class);
        startActivity(intent);


    }

    public void fitnesswednesday(View view) {
        Intent intent = new Intent(this, FitnessWednesday.class);
        startActivity(intent);


    }



    public void fitnesssaturday(View view) {
        Intent intent = new Intent(this, FitnessFriday.class);
        startActivity(intent);


    }


}
