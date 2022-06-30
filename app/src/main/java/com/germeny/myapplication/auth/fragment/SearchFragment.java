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
import com.germeny.myapplication.auth.Adapter.SearchHeaderAdapter;
import com.germeny.myapplication.auth.Adapter.SearchMainAdapter;
import com.germeny.myapplication.auth.PostActivity;
import com.germeny.myapplication.auth.model.HomeModel;
import com.germeny.myapplication.auth.model.MainHeader;
import com.germeny.myapplication.auth.model.SearchHeaderModel;
import com.germeny.myapplication.auth.model.SearchMainModel;
import com.germeny.myapplication.databinding.FragmentSearchBinding;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    private List<SearchHeaderModel> headerList = new ArrayList<>();
    private SearchHeaderAdapter headerAdapter;

    private List<SearchMainModel> mainList = new ArrayList<>();
    private SearchMainAdapter mainAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button postbtn = binding.searchpost;
        postbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), PostActivity.class);
                startActivity(i);
            }
        });

        RecyclerView headerrecyclerView = binding.searchrecyclerView;
        headerAdapter = new SearchHeaderAdapter(headerList);
        LinearLayoutManager headerLayoutManager = new LinearLayoutManager(getContext());
        headerLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        headerrecyclerView.setLayoutManager(headerLayoutManager);
        headerrecyclerView.setItemAnimator(new DefaultItemAnimator());
        headerrecyclerView.setAdapter(headerAdapter);
        prepareheaderData();

        RecyclerView mainrecycler = binding.searchmainrecyclerView;
        mainAdapter = new SearchMainAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(getContext());
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();

        return root;
    }

    private void prepareheaderData() {
        SearchHeaderModel movie = new SearchHeaderModel("People");
        headerList.add(movie);
        SearchHeaderModel movie1 = new SearchHeaderModel("Events");
        headerList.add(movie1);
        SearchHeaderModel movie2 = new SearchHeaderModel("Post");
        headerList.add(movie2);
        SearchHeaderModel movie3 = new SearchHeaderModel("Photos");
        headerList.add(movie3);
        SearchHeaderModel movie4 = new SearchHeaderModel("Pages");
        headerList.add(movie4);
    }

    private void preparemaindData() {
        SearchMainModel movie = new SearchMainModel(R.drawable.image1, "John doe", "joho@doe.com");
        mainList.add(movie);
        SearchMainModel movie1 = new SearchMainModel(R.drawable.image2, "Valentyn Ovanenko", "Valentyn@doe.com");
        mainList.add(movie1);
        SearchMainModel movie2 = new SearchMainModel(R.drawable.image3, "Jane area", "Jane@doe.com");
        mainList.add(movie2);
        SearchMainModel movie3 = new SearchMainModel(R.drawable.image4, "Robert james", "Robert@doe.com");
        mainList.add(movie3);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}