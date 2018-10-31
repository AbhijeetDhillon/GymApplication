package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Strength extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void strengthmeal (View view)
    {
        Intent intent = new Intent(this, Strengthmeal.class);
        startActivity(intent);
    }

    public void StrenghtWorkout (View view)
    {
        Intent intent = new Intent(this, strenghtWorkout.class);
        startActivity(intent);
    }

    public void strengthtips (View view)
    {
        Intent intent = new Intent(this, StrenghtTips.class);
        startActivity(intent);
    }

}
