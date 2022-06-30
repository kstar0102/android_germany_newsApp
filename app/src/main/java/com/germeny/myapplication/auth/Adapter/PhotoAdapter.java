package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.PhotoModel;
import com.germeny.myapplication.auth.model.RecordModel;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.MyPhotoHolder> {

    private List<PhotoModel> photoList;

    class MyPhotoHolder extends RecyclerView.ViewHolder {

        ImageView photo1,photo2,photo3;

        MyPhotoHolder(View view) {
            super(view);

            photo1 = view.findViewById(R.id.photo_image1);
            photo2 = view.findViewById(R.id.photo_image2);
            photo3 = view.findViewById(R.id.photo_image3);
        }
    }

    public PhotoAdapter(List<PhotoModel> photoList) {
        this.photoList = photoList;
    }

    @NonNull
    @Override
    public PhotoAdapter.MyPhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photo_list, parent, false);
        return new PhotoAdapter.MyPhotoHolder(itemView);
    }
    @Override
    public void onBindViewHolder(PhotoAdapter.MyPhotoHolder holder, int position) {
        PhotoModel model = photoList.get(position);
        holder.photo1.setImageResource(model.getPhoto1());
        holder.photo2.setImageResource(model.getPhoto2());
        holder.photo3.setImageResource(model.getPhoto3());
    }
    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
