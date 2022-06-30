package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.SearchHeaderModel;

import java.util.List;

public class SearchHeaderAdapter extends RecyclerView.Adapter<SearchHeaderAdapter.MyViewHolder> {
    private List<SearchHeaderModel> headerlist;
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.search_header_title);
        }
    }
    public SearchHeaderAdapter(List<SearchHeaderModel> headerlist) {
        this.headerlist = headerlist;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.searchheader_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SearchHeaderModel movie = headerlist.get(position);
        holder.title.setText(movie.getTitle());
    }
    @Override
    public int getItemCount() {
        return headerlist.size();
    }
}
