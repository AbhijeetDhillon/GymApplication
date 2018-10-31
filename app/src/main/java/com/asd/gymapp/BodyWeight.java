package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class BodyWeight extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_weight);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void BodyweightWorkout (View view)
    {
        Intent intent = new Intent(this, bodyweightWorkout.class);
        startActivity(intent);
    }

    public void bwmeal (View view)
    {
        Intent intent = new Intent(this, BodyWeightmeal.class);
        startActivity(intent);
    }

    public void bwtips (View view)
    {
        Intent intent = new Intent(this, BodyWeightTips.class);
        startActivity(intent);
    }
}
