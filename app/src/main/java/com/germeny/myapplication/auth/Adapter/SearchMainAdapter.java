package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.SearchMainModel;

import java.util.List;

public class SearchMainAdapter extends RecyclerView.Adapter<SearchMainAdapter.MySearchHolder> {

    private List<SearchMainModel> searchList;

    class MySearchHolder extends RecyclerView.ViewHolder {

        ImageView imageTitle;
        TextView name, email;
        MySearchHolder(View view) {
            super(view);

            imageTitle = view.findViewById(R.id.search_character);
            name = view.findViewById(R.id.search_name);
            email = view.findViewById(R.id.search_email);
        }
    }

    public SearchMainAdapter(List<SearchMainModel> searchList) {
        this.searchList = searchList;
    }

    @NonNull
    @Override
    public SearchMainAdapter.MySearchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.searchmain_list, parent, false);
        return new SearchMainAdapter.MySearchHolder(itemView);
    }
    @Override
    public void onBindViewHolder(SearchMainAdapter.MySearchHolder holder, int position) {
        SearchMainModel model = searchList.get(position);
        holder.imageTitle.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.email.setText(model.getEmail());
    }
    @Override
    public int getItemCount() {
        return searchList.size();
    }
}
