package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Bulk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
    public void bulkBody(View view) {
        Intent intent = new Intent(this, bulkWorkout.class);
        startActivity(intent);


    }

    public void bulkmeal(View view) {
        Intent intent = new Intent(this,BulkDiet.class);
        startActivity(intent);


    }

    public void bulktips (View view) {
        Intent intent = new Intent(this, BulkTips.class);
        startActivity(intent);


    }
}