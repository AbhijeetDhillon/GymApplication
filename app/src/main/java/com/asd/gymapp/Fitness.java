package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Fitness extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    public void FitnessWorkout(View view) {
        Intent intent = new Intent(this, fitnessWorkout.class);
        startActivity(intent);
    }

    public void fitnessmeal(View view) {
        Intent intent = new Intent(this, Fitnessmeal.class);
        startActivity(intent);
    }

    public void fitnesstips(View view) {
        Intent intent = new Intent(this, FitnessTips.class);
        startActivity(intent);
    }
}

