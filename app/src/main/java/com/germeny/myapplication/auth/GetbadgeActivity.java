package com.germeny.myapplication.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.germeny.myapplication.R;

public class GetbadgeActivity extends AppCompatActivity {
    Button blueBtn, laterBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getbadge);
        getSupportActionBar().hide();

        blueBtn = (Button)findViewById(R.id.blueBtn);
        laterBtn = (Button)findViewById(R.id.laterBtn);

        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetbadgeActivity.this, MainActivity.class);
                startActivity(intent );
            }
        });

        laterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetbadgeActivity.this, MainActivity.class);
                startActivity(intent );
            }
        });
    }
}
