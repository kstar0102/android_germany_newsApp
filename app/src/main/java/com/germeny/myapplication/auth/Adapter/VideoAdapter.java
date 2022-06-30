package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.PhotoModel;
import com.germeny.myapplication.auth.model.VideoModel;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyVideoHolder> {

    private List<VideoModel> videolist;

    class MyVideoHolder extends RecyclerView.ViewHolder {

        ImageView video1,video2,video3;

        MyVideoHolder(View view) {
            super(view);

            video1 = view.findViewById(R.id.video_image1);
            video2 = view.findViewById(R.id.video_image2);
            video3 = view.findViewById(R.id.video_image3);
        }
    }

    public VideoAdapter(List<VideoModel> videolist) {
        this.videolist = videolist;
    }

    @NonNull
    @Override
    public VideoAdapter.MyVideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_list, parent, false);
        return new VideoAdapter.MyVideoHolder(itemView);
    }
    @Override
    public void onBindViewHolder(VideoAdapter.MyVideoHolder holder, int position) {
        VideoModel model = videolist.get(position);
        holder.video1.setImageResource(model.getVideo1());
        holder.video2.setImageResource(model.getVideo2());
        holder.video3.setImageResource(model.getVideo3());
    }
    @Override
    public int getItemCount() {
        return videolist.size();
    }
}
