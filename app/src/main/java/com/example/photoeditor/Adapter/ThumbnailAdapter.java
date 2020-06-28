package com.example.photoeditor.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photoeditor.R;

public class ThumbnailAdapter extends RecyclerView.Adapter<ThumbnailAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //init views
        ImageView thumbnail;
        TextView filter_name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            filter_name = (TextView) itemView.findViewById(R.id.filter_name);
        }
    }
}
