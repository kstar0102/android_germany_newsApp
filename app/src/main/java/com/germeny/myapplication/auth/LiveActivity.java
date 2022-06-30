package com.germeny.myapplication.auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.germeny.myapplication.R;

public class LiveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        getSupportActionBar().hide();
    }
}
