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
import com.germeny.myapplication.auth.model.UserPModel;

import java.util.List;

public class UserPAdapter extends RecyclerView.Adapter<UserPAdapter.MyUserHolder> {

private List<UserPModel> userList;

class MyUserHolder extends RecyclerView.ViewHolder {

    ImageView caractorimage, markimage, bangimage, userpimage;
    TextView name, email;
    MyUserHolder(View view) {
        super(view);

        caractorimage = view.findViewById(R.id.user_character);
        markimage = view.findViewById(R.id.user_mark);
        bangimage = view.findViewById(R.id.user_bang);
        userpimage = view.findViewById(R.id.user_user);
        name = view.findViewById(R.id.user_name);
        email = view.findViewById(R.id.user_email);
    }
}

    public UserPAdapter(List<UserPModel> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserPAdapter.MyUserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_list, parent, false);
        return new UserPAdapter.MyUserHolder(itemView);
    }
    @Override
    public void onBindViewHolder(UserPAdapter.MyUserHolder holder, int position) {
        UserPModel model = userList.get(position);
        holder.caractorimage.setImageResource(model.getCaractorimage());
        holder.markimage.setImageResource(model.getMarkimage());
        holder.bangimage.setImageResource(model.getBangimage());
        holder.userpimage.setImageResource(model.getUserproimage());
        holder.name.setText(model.getName());
        holder.email.setText(model.getEmail());
    }
    @Override
    public int getItemCount() {
        return userList.size();
    }
}

