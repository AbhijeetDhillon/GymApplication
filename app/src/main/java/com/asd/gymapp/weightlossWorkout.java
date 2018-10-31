package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class weightlossWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightloss_workout);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void weightlossmonday(View view) {
        Intent intent = new Intent(this, WeightLossMonday.class);
        startActivity(intent);


    }

    public void weightlosstuesday(View view) {
        Intent intent = new Intent(this, WeightLossTuesday.class);
        startActivity(intent);


    }

    public void weightlosswednesday(View view) {
        Intent intent = new Intent(this, WeightLossWednesday.class);
        startActivity(intent);


    }

    public void weightlossfriday(View view) {
        Intent intent = new Intent(this, WeightLossFriday.class);
        startActivity(intent);


    }

    public void weightlosssaturday(View view) {
        Intent intent = new Intent(this, WeightLossSaturday.class);
        startActivity(intent);


    }

}
