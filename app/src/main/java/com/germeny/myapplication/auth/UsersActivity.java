package com.germeny.myapplication.auth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.SearchMainAdapter;
import com.germeny.myapplication.auth.Adapter.UserPAdapter;
import com.germeny.myapplication.auth.model.SearchMainModel;
import com.germeny.myapplication.auth.model.UserPModel;

import java.util.ArrayList;
import java.util.List;

public class UsersActivity extends AppCompatActivity {

    private List<UserPModel> mainList = new ArrayList<>();
    private UserPAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        getSupportActionBar().hide();

        RecyclerView mainrecycler = findViewById(R.id.userrecyclerView);
        mainAdapter = new UserPAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(this);
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();
    }

    private void preparemaindData() {
        UserPModel movie = new UserPModel(R.drawable.image1, R.drawable.ic_blue_mark, R.drawable.ic_bangblue, R.drawable.ic_userblue,"John doe", "joho@doe.com");
        mainList.add(movie);
        UserPModel movie1 = new UserPModel(R.drawable.image2, R.drawable.ic_blue_mark, R.drawable.ic_bangblue, R.drawable.ic_userblue,"John doe", "joho@doe.com");
        mainList.add(movie1);
        UserPModel movie2 = new UserPModel(R.drawable.image3, R.drawable.ic_blue_mark, R.drawable.ic_bangblue, R.drawable.ic_userblue,"John doe", "joho@doe.com");
        mainList.add(movie2);
        UserPModel movie3 = new UserPModel(R.drawable.image4, R.drawable.ic_blue_mark, R.drawable.ic_bangblue, R.drawable.ic_userblue,"John doe", "joho@doe.com");
        mainList.add(movie3);
    }
}
