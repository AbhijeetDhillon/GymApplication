package com.asd.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asdhillon.admin.gymapplication.R;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

    public void bulkBody(View view) {
        Intent intent = new Intent(this, Bulk.class);
        startActivity(intent);
    }

    public void leanBody(View view) {
        Intent intent = new Intent(this, Lean.class);
        startActivity(intent);
    }

    public void strength(View view) {
        Intent intent = new Intent(this, Strength.class);
        startActivity(intent);
    }

    public void fitness(View view) {
        Intent intent = new Intent(this, Fitness
                .class);
        startActivity(intent);
    }

    public void weightloss(View view) {
        Intent intent = new Intent(this, WeightLoss.class);
        startActivity(intent);
    }

    public void bodyWeight(View view) {
        Intent intent = new Intent(this, BodyWeight.class);
        startActivity(intent);
    }


    }





