package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class WeightLoss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void WeightLossWorkout (View view)
    {
        Intent intent = new Intent(this, weightlossWorkout.class);
        startActivity(intent);
    }

    public void wlmeal (View view)
    {
        Intent intent = new Intent(this, Weightlossmeal.class);
        startActivity(intent);
    }

    public void wltips (View view)
    {
        Intent intent = new Intent(this,WeightLossTips.class);
        startActivity(intent);
    }
}

