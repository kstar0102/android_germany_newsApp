package com.germeny.myapplication.auth.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.germeny.myapplication.R;
import com.germeny.myapplication.auth.model.RecordModel;

import java.util.List;

public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.MyrecordHolder> {

    private List<RecordModel> recordList;

    class MyrecordHolder extends RecyclerView.ViewHolder {

        TextView name, des;

        MyrecordHolder(View view) {
            super(view);

            name = view.findViewById(R.id.record_name);
            des = view.findViewById(R.id.record_des);
        }
    }

    public RecordAdapter(List<RecordModel> recordList) {
        this.recordList = recordList;
    }

    @NonNull
    @Override
    public RecordAdapter.MyrecordHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.record_list, parent, false);
        return new RecordAdapter.MyrecordHolder(itemView);
    }
    @Override
    public void onBindViewHolder(RecordAdapter.MyrecordHolder holder, int position) {
        RecordModel model = recordList.get(position);
        holder.name.setText(model.getName());
        holder.des.setText(model.getDes());
    }
    @Override
    public int getItemCount() {
        return recordList.size();
    }
}
