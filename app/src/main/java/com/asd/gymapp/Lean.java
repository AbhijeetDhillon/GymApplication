package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Lean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void LeanWorkout (View view)
    {
        Intent intent = new Intent(this, leanWorkout.class);
        startActivity(intent);
    }

    public void leanmeal (View view)
    {
        Intent intent = new Intent(this, leanmeal.class);
        startActivity(intent);
    }

    public void leantips (View view)
    {
        Intent intent = new Intent(this, LeanTips.class);
        startActivity(intent);
    }
}
