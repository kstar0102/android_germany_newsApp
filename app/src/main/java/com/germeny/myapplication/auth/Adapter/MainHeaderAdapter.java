package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.MainHeader;

import java.util.List;

public class MainHeaderAdapter extends RecyclerView.Adapter<MainHeaderAdapter.MyViewHolder> {
    private List<MainHeader> moviesList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageTitle;
        MyViewHolder(View view) {
            super(view);
            imageTitle = view.findViewById(R.id.header_image);
        }
    }
    public MainHeaderAdapter(List<MainHeader> moviesList) {
        this.moviesList = moviesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mainheader_list, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainHeader movie = moviesList.get(position);
        holder.imageTitle.setImageResource(movie.getImage());
    }
    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
