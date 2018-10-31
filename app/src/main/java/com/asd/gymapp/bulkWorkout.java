package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class bulkWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_workout);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void BulkMonday(View view) {
        Intent intent = new Intent(this, BulkMonday.class);
        startActivity(intent);


    }

    public void BulkTuesday(View view) {
        Intent intent = new Intent(this, BulkTuesday.class);
        startActivity(intent);


    }

    public void BulkWednesday(View view) {
        Intent intent = new Intent(this, BulkWednesday.class);
        startActivity(intent);


    }

    public void BulkThursday(View view) {
        Intent intent = new Intent(this, BulkThursday.class);
        startActivity(intent);


    }

    public void BulkFriday(View view) {
        Intent intent = new Intent(this, BulkFriday.class);
        startActivity(intent);


    }



}
