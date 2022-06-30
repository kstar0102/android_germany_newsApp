package com.germeny.myapplication.auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.RecordAdapter;
import com.germeny.myapplication.auth.Adapter.UserPAdapter;
import com.germeny.myapplication.auth.model.RecordModel;
import com.germeny.myapplication.auth.model.UserPModel;

import java.util.ArrayList;
import java.util.List;

public class RecordActivity extends AppCompatActivity {

    private List<RecordModel> mainList = new ArrayList<>();
    private RecordAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        getSupportActionBar().hide();

        RecyclerView mainrecycler = findViewById(R.id.recordrecyclerView);
        mainAdapter = new RecordAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(this);
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();
    }

    private void preparemaindData() {
        RecordModel movie = new RecordModel("John doe", "joho@doe.com");
        mainList.add(movie);
        RecordModel movie1 = new RecordModel("John doe", "joho@doe.com");
        mainList.add(movie1);
        RecordModel movie2 = new RecordModel("John doe", "joho@doe.com");
        mainList.add(movie2);
        RecordModel movie3 = new RecordModel("John doe", "joho@doe.com");
        mainList.add(movie3);
    }
}
