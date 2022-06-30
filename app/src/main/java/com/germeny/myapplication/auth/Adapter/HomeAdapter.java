package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.HomeModel;
import com.germeny.myapplication.auth.model.MainHeader;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    private List<HomeModel> cardList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageTitle;
        TextView name, time, des;
        MyViewHolder(View view) {
            super(view);

            imageTitle = view.findViewById(R.id.home_character);
            name = view.findViewById(R.id.home_name);
            time = view.findViewById(R.id.home_time);
            des = view.findViewById(R.id.home_des);
        }
    }
    public HomeAdapter(List<HomeModel> cardList) {
        this.cardList = cardList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mainhome_list, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        HomeModel model = cardList.get(position);
        holder.imageTitle.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.time.setText(model.getTime());
        holder.des.setText(model.getDes());
    }
    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
