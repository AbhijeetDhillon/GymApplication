package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class leanWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_workout);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void leanmonday(View view) {
        Intent intent = new Intent(this, LeanMonday.class);
        startActivity(intent);


    }

    public void leantuesday(View view) {
        Intent intent = new Intent(this, LeanTuesday.class);
        startActivity(intent);


    }

    public void leanwednesday(View view) {
        Intent intent = new Intent(this, LeanWednesday.class);
        startActivity(intent);


    }

    public void leanthursday(View view) {
        Intent intent = new Intent(this, LeanThursday.class);
        startActivity(intent);


    }

    public void leanfriday(View view) {
        Intent intent = new Intent(this, LeanFriday.class);
        startActivity(intent);


    }

    public void leansaturday(View view) {
        Intent intent = new Intent(this, LeanSaturday.class);
        startActivity(intent);


    }



}
