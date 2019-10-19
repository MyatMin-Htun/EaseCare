package com.example.easecare;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<FeedNews> FeedNewsList;

    public RecyclerViewAdapter(Context context, ArrayList<FeedNews> feedList) {

        this.FeedNewsList = feedList;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_layout_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        FeedNews feedList = FeedNewsList.get(position);

        holder.txtTitle.setText(feedList.getTitle());
        holder.txtDoctorName.setText(feedList.getName());
    }

    @Override
    public int getItemCount() {

        return FeedNewsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtDoctorName;
        public TextView txtTitle;

        public ViewHolder(View itemView) {

            super(itemView);

            txtDoctorName = (TextView) itemView.findViewById(R.id.txtDoctor_name);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            System.out.println(FeedNewsList.get(getAdapterPosition()).getName());
            Intent feedInfo = new Intent(view.getContext(), Feed.class);
            feedInfo.putExtra("feedInfo_Name", FeedNewsList.get(getAdapterPosition()).getName());
            feedInfo.putExtra("feedInfo_Content", FeedNewsList.get(getAdapterPosition()).getContent());
            feedInfo.putExtra("feedInfo_Title", FeedNewsList.get(getAdapterPosition()).getTitle());
            view.getContext().startActivity(feedInfo);
        }
    }
}