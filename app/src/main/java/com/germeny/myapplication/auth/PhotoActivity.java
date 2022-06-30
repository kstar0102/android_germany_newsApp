package com.germeny.myapplication.auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.PhotoAdapter;
import com.germeny.myapplication.auth.Adapter.RecordAdapter;
import com.germeny.myapplication.auth.Adapter.UserPAdapter;
import com.germeny.myapplication.auth.model.PhotoModel;
import com.germeny.myapplication.auth.model.RecordModel;

import java.util.ArrayList;
import java.util.List;

public class PhotoActivity extends AppCompatActivity {
    private List<PhotoModel> mainList = new ArrayList<>();
    private PhotoAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        getSupportActionBar().hide();

        RecyclerView mainrecycler = findViewById(R.id.photorecyclerView);
        mainAdapter = new PhotoAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(this);
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();
    }

    private void preparemaindData() {
        PhotoModel movie = new PhotoModel(R.drawable.photo1, R.drawable.photo2,R.drawable.photo3);
        mainList.add(movie);
        PhotoModel movie1 = new PhotoModel(R.drawable.photo1, R.drawable.photo1,R.drawable.photo1);
        mainList.add(movie1);
        PhotoModel movie2 = new PhotoModel(R.drawable.photo2, R.drawable.photo3,R.drawable.photo2);
        mainList.add(movie2);
        PhotoModel movie3 = new PhotoModel(R.drawable.photo3, R.drawable.photo2,R.drawable.photo1);
        mainList.add(movie3);
    }
}
