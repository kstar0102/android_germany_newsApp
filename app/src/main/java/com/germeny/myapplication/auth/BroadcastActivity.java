package com.germeny.myapplication.auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.BroadAdapter;
import com.germeny.myapplication.auth.Adapter.PhotoAdapter;
import com.germeny.myapplication.auth.model.BroadModel;
import com.germeny.myapplication.auth.model.PhotoModel;

import java.util.ArrayList;
import java.util.List;

public class BroadcastActivity extends AppCompatActivity{
    private List<BroadModel> mainList = new ArrayList<>();
    private BroadAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        getSupportActionBar().hide();

        RecyclerView mainrecycler = findViewById(R.id.broadrecyclerView);
        mainAdapter = new BroadAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(this);
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();
    }

    private void preparemaindData() {
        BroadModel movie = new BroadModel(getResources().getDrawable(R.drawable.broad1));
        mainList.add(movie);
        BroadModel movie1 = new BroadModel(getResources().getDrawable(R.drawable.broad2));
        mainList.add(movie1);
        BroadModel movie3 = new BroadModel(getResources().getDrawable(R.drawable.broad3));
        mainList.add(movie3);
    }
}
