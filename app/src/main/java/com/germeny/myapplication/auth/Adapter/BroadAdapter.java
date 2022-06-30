package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.BroadModel;
import com.germeny.myapplication.auth.model.PhotoModel;

import java.util.List;

public class BroadAdapter extends RecyclerView.Adapter<BroadAdapter.MyPhotoHolder> {

    private List<BroadModel> broadList;

    class MyPhotoHolder extends RecyclerView.ViewHolder {

        LinearLayout broad;

        MyPhotoHolder(View view) {
            super(view);
            broad = view.findViewById(R.id.broadcast_list);
        }
    }

    public BroadAdapter(List<BroadModel> broadList) {
        this.broadList = broadList;
    }

    @NonNull
    @Override
    public BroadAdapter.MyPhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.broadcast_list, parent, false);
        return new BroadAdapter.MyPhotoHolder(itemView);
    }
    @Override
    public void onBindViewHolder(BroadAdapter.MyPhotoHolder holder, int position) {
        BroadModel model = broadList.get(position);
        holder.broad.setBackground(model.getBroad());
    }
    @Override
    public int getItemCount() {
        return broadList.size();
    }
}

