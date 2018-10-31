package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class bodyweightWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyweight_workout);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void bodyweightmonday(View view) {
        Intent intent = new Intent(this, BodyWeightMonday.class);
        startActivity(intent);


    }

    public void bodyweighttuesday(View view) {
        Intent intent = new Intent(this, BodyWeightTuesday.class);
        startActivity(intent);


    }



    public void bodyweightthursday(View view) {
        Intent intent = new Intent(this, BodyWeightThursday.class);
        startActivity(intent);


    }


    public void bodyweightfriday(View view) {
        Intent intent = new Intent(this, BodyWeightFriday.class);
        startActivity(intent);


    }


    public void bodyweightsaturday(View view) {
        Intent intent = new Intent(this, BodyWeightSaturday.class);
        startActivity(intent);


    }


    }


