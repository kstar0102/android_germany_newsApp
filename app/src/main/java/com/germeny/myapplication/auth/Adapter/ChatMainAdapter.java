package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.ChatMainModel;

import java.util.List;

public class ChatMainAdapter extends RecyclerView.Adapter<ChatMainAdapter.MychatHolder> {

private List<ChatMainModel> chatmainlist;

class MychatHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name, content, time;
    MychatHolder(View view) {
        super(view);

        image = view.findViewById(R.id.chat_main_character);
        name = view.findViewById(R.id.chat_main_name);
        content = view.findViewById(R.id.chat_main_content);
        time = view.findViewById(R.id.chat_main_time);
    }
}

    public ChatMainAdapter(List<ChatMainModel> chatmainlist) {
        this.chatmainlist = chatmainlist;
    }

    @NonNull
    @Override
    public ChatMainAdapter.MychatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chatmain_list, parent, false);
        return new ChatMainAdapter.MychatHolder(itemView);
    }
    @Override
    public void onBindViewHolder(ChatMainAdapter.MychatHolder holder, int position) {
        ChatMainModel model = chatmainlist.get(position);
        holder.image.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.content.setText(model.getContent());
        holder.time.setText(model.getTime());
    }
    @Override
    public int getItemCount() {
        return chatmainlist.size();
    }
}
