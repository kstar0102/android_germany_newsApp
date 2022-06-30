package com.germeny.myapplication.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.VideoAdapter;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().hide();

        LinearLayout allusers = findViewById(R.id.allusers);
        LinearLayout record = findViewById(R.id.record);
        LinearLayout video = findViewById(R.id.video);
        LinearLayout photo = findViewById(R.id.photo);
        LinearLayout boradcast = findViewById(R.id.broadcast);
        LinearLayout menu_sell = findViewById(R.id.menu_sell);

        allusers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, UsersActivity.class);
                startActivity(i);
            }
        });

        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, RecordActivity.class);
                startActivity(i);
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, PhotoActivity.class);
                startActivity(i);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, VideoActivity.class);
                startActivity(i);
            }
        });

        boradcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, BroadcastActivity.class);
                startActivity(i);
            }
        });

        menu_sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, SellActivity.class);
                startActivity(i);
            }
        });
    }
}
