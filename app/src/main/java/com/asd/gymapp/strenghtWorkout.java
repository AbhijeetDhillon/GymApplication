package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class strenghtWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strenght_workout);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void strenghtmonday(View view) {
        Intent intent = new Intent(this, StrenghtMonday.class);
        startActivity(intent);


    }

    public void strenghtwednesday(View view) {
        Intent intent = new Intent(this, StrenghtWednesday.class);
        startActivity(intent);


    }

    public void strenghtthursday(View view) {
        Intent intent = new Intent(this, StrenghtThursday.class);
        startActivity(intent);


    }

    public void strenghtfriday(View view) {
        Intent intent = new Intent(this, StrenghtFriday.class);
        startActivity(intent);


    }


}
