package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.ChatHeaderModel;

import java.util.List;

public class ChatHeaderAdapter extends RecyclerView.Adapter<ChatHeaderAdapter.MyViewHolder> {
    private List<ChatHeaderModel> headerlist;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        MyViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.chat_header_image);
            title = view.findViewById(R.id.chat_haeder_title);
        }
    }
    public ChatHeaderAdapter(List<ChatHeaderModel> headerlist) {
        this.headerlist = headerlist;
    }
    @NonNull
    @Override
    public ChatHeaderAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chatheader_list, parent, false);
        return new ChatHeaderAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ChatHeaderAdapter.MyViewHolder holder, int position) {
        ChatHeaderModel movie = headerlist.get(position);
        holder.title.setText(movie.getTitle());
        holder.image.setImageResource(movie.getImage());
    }
    @Override
    public int getItemCount() {
        return headerlist.size();
    }
}
