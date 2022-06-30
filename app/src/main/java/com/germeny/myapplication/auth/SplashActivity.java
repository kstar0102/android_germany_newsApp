package com.germeny.myapplication.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.germeny.myapplication.R;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // run() method will be executed when 3 seconds have passed

                //Time to start MainActivity
                Intent intent = new Intent(SplashActivity.this, StartActivity.class);
                startActivity(intent );

                finish();
            }
        }, SPLASH_TIME);
    }
}