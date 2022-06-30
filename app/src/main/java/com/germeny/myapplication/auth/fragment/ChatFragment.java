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
import com.germeny.myapplication.auth.Adapter.ChatHeaderAdapter;
import com.germeny.myapplication.auth.Adapter.ChatMainAdapter;
import com.germeny.myapplication.auth.Adapter.SearchHeaderAdapter;
import com.germeny.myapplication.auth.Adapter.SearchMainAdapter;
import com.germeny.myapplication.auth.PostActivity;
import com.germeny.myapplication.auth.model.ChatHeaderModel;
import com.germeny.myapplication.auth.model.ChatMainModel;
import com.germeny.myapplication.auth.model.SearchHeaderModel;
import com.germeny.myapplication.auth.model.SearchMainModel;
import com.germeny.myapplication.databinding.FragmentChatBinding;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private FragmentChatBinding binding;

    private List<ChatHeaderModel> headerList = new ArrayList<>();
    private ChatHeaderAdapter headerAdapter;

    private List<ChatMainModel> mainList = new ArrayList<>();
    private ChatMainAdapter mainAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentChatBinding.inflate(inflater, container, false);
        Button postBtn = binding.chatpost;
        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), PostActivity.class);
                startActivity(i);
            }
        });

        View root = binding.getRoot();

        RecyclerView headerrecyclerView = binding.chatheaderrecyclerView;
        headerAdapter = new ChatHeaderAdapter(headerList);
        LinearLayoutManager headerLayoutManager = new LinearLayoutManager(getContext());
        headerLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        headerrecyclerView.setLayoutManager(headerLayoutManager);
        headerrecyclerView.setItemAnimator(new DefaultItemAnimator());
        headerrecyclerView.setAdapter(headerAdapter);
        prepareheaderData();

        RecyclerView mainrecycler = binding.chatmainrecyclerView;
        mainAdapter = new ChatMainAdapter(mainList);
        LinearLayoutManager HLayoutManager = new LinearLayoutManager(getContext());
        HLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainrecycler.setLayoutManager(HLayoutManager);
        mainrecycler.setItemAnimator(new DefaultItemAnimator());
        mainrecycler.setAdapter(mainAdapter);
        preparemaindData();

        Button chatBtn = binding.chatbtn;
        Button callbtn = binding.callbtn;

        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatBtn.setBackground(getContext().getResources().getDrawable(R.drawable.leftbuttonback));
                callbtn.setBackground(getContext().getResources().getDrawable(R.drawable.unrightbuttonback));
            }
        });

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatBtn.setBackground(getContext().getResources().getDrawable(R.drawable.unleftbuttonback));
                callbtn.setBackground(getContext().getResources().getDrawable(R.drawable.rightbuttonback));
            }
        });
        return root;
    }

    private void prepareheaderData() {
        ChatHeaderModel movie = new ChatHeaderModel(R.drawable.addimage,"Add story");
        headerList.add(movie);
        ChatHeaderModel movie1 = new ChatHeaderModel(R.drawable.image1,"Thania");
        headerList.add(movie1);
        ChatHeaderModel movie2 = new ChatHeaderModel(R.drawable.onlineimage1,"Sadmano");
        headerList.add(movie2);
        ChatHeaderModel movie3 = new ChatHeaderModel(R.drawable.onlineimage2,"Halarbhai");
        headerList.add(movie3);
        ChatHeaderModel movie4 = new ChatHeaderModel(R.drawable.image4,"Tumtam");
        headerList.add(movie4);
        ChatHeaderModel movie5 = new ChatHeaderModel(R.drawable.image6,"Yamile");
        headerList.add(movie5);

    }

    private void preparemaindData() {
        ChatMainModel movie = new ChatMainModel(R.drawable.image1, "John doe", "SHei moaja hoitese chol jai", "7:06 PM");
        mainList.add(movie);
        ChatMainModel movie1 = new ChatMainModel(R.drawable.image2, "Valentyn Ovanenko", "SHei moaja hoitese chol jai","7:06 PM");
        mainList.add(movie1);
        ChatMainModel movie2 = new ChatMainModel(R.drawable.image3, "Jane area", "SHei moaja hoitese chol jai","7:06 PM");
        mainList.add(movie2);
        ChatMainModel movie3 = new ChatMainModel(R.drawable.image4, "Robert james", "SHei moaja hoitese chol jai","7:06 PM");
        mainList.add(movie3);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}