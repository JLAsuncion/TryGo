package com.example.trygo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class activity_commuter_mainpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commuter_mainpage);






    }

    public void searchButton(View v){
        Intent intent = new Intent(this, activity_commuter_pagemap.class);
        startActivity(intent);
    }
}