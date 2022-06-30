package com.germeny.myapplication.auth.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.Adapter.HomeAdapter;
import com.germeny.myapplication.auth.Adapter.MainHeaderAdapter;
import com.germeny.myapplication.auth.PostActivity;
import com.germeny.myapplication.auth.model.HomeModel;
import com.germeny.myapplication.auth.model.MainHeader;
import com.germeny.myapplication.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private List<MainHeader> movieList = new ArrayList<>();
    private MainHeaderAdapter mAdapter;

    private List<HomeModel> homeList = new ArrayList<>();
    private HomeAdapter HAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        Button postbtn = binding.homepost;
        postbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), PostActivity.class);
                startActivity(i);
            }
        });
        View root = binding.getRoot();

        RecyclerView recyclerView = binding.recyclerView;
        mAdapter = new MainHeaderAdapter(movieList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();


        RecyclerView mainrecycler = binding.mainrecyclerView;
        HAdapter = new HomeAdapter(homeList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(getContext());
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(HAdapter);
        preparecardData();

        return root;
    }

    private void prepareMovieData() {
        MainHeader movie = new MainHeader(R.drawable.addimage);
        movieList.add(movie);
        MainHeader movie1 = new MainHeader(R.drawable.image1);
        movieList.add(movie1);
        MainHeader movie2 = new MainHeader(R.drawable.image2);
        movieList.add(movie2);
        MainHeader movie3 = new MainHeader(R.drawable.image3);
        movieList.add(movie3);
        MainHeader movie4 = new MainHeader(R.drawable.image4);
        movieList.add(movie4);
        MainHeader movie6 = new MainHeader(R.drawable.image4);
        movieList.add(movie6);
        MainHeader movie7 = new MainHeader(R.drawable.image4);
        movieList.add(movie7);
        MainHeader movie8 = new MainHeader(R.drawable.image4);
        movieList.add(movie8);

    }

    private void preparecardData() {
        HomeModel movie = new HomeModel(R.drawable.image1, "John doe", "04 Feb, 12:47 PM", "I am a android developer.");
        homeList.add(movie);
        HomeModel movie1 = new HomeModel(R.drawable.image2, "Jane area", "30 Jan, 10:17 PM", "I am a android developer.");
        homeList.add(movie1);
        HomeModel movie2 = new HomeModel(R.drawable.image3, "Dimitri", "21 Oct, 19:47 PM", "I am a android developer.");
        homeList.add(movie2);
        HomeModel movie3 = new HomeModel(R.drawable.image4, "Valentyn", "01 Jan, 20:47 PM", "I am a android developer.");
        homeList.add(movie3);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}