package com.germeny.myapplication.auth;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.fragment.AudioFragment;
import com.germeny.myapplication.auth.fragment.PhotoFragment;
import com.germeny.myapplication.auth.fragment.VideoFragment;

public class PostActivity extends AppCompatActivity {
    LinearLayout videobtn, audiobtn, photobtn, golivebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psot);

        getSupportActionBar().hide();

        videobtn = findViewById(R.id.videobtn);
        photobtn = findViewById(R.id.photobtn);
        audiobtn = findViewById(R.id.audiobtn);
        golivebtn = findViewById(R.id.golivebtn);
        loadFragment(new VideoFragment());

        videobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new VideoFragment());
            }
        });

        photobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new PhotoFragment());
            }
        });

        audiobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AudioFragment());
            }
        });

        golivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PostActivity.this, LiveActivity.class);
                startActivity(i);
            }
        });

    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }




}
