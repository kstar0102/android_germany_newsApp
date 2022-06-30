package com.germeny.myapplication.auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.BroadAdapter;
import com.germeny.myapplication.auth.Adapter.PhotoAdapter;
import com.germeny.myapplication.auth.Adapter.VideoAdapter;
import com.germeny.myapplication.auth.model.BroadModel;
import com.germeny.myapplication.auth.model.PhotoModel;
import com.germeny.myapplication.auth.model.VideoModel;

import java.util.ArrayList;
import java.util.List;

public class SellActivity extends AppCompatActivity {
    private List<PhotoModel> mainList = new ArrayList<>();
    private PhotoAdapter mainAdapter;

    private List<BroadModel> videoList = new ArrayList<>();
    private BroadAdapter videoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        getSupportActionBar().hide();

        RecyclerView mainrecycler = findViewById(R.id.sellphotorecyclerView);
        mainAdapter = new PhotoAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(this);
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();

        RecyclerView videorecycler = findViewById(R.id.sellvideorecyclerView);
        videoAdapter = new BroadAdapter(videoList);
        LinearLayoutManager VLayoutManager = new LinearLayoutManager(this);
        VLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        videorecycler.setLayoutManager(VLayoutManager);
        videorecycler.setItemAnimator(new DefaultItemAnimator());
        videorecycler.setAdapter(videoAdapter);
        preparvideodData();

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

    private void preparvideodData() {
        BroadModel movie = new BroadModel(getResources().getDrawable(R.drawable.broad1));
        videoList.add(movie);
        BroadModel movie1 = new BroadModel(getResources().getDrawable(R.drawable.broad2));
        videoList.add(movie1);
        BroadModel movie3 = new BroadModel(getResources().getDrawable(R.drawable.broad3));
        videoList.add(movie3);
    }
}
