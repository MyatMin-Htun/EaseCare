package com.example.easecare;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter_forMessaging extends RecyclerView.Adapter<RecyclerViewAdapter_forMessaging.ViewHolder> {

    Context context;
    ArrayList<Message> messageList;

    public RecyclerViewAdapter_forMessaging(Context context, ArrayList<Message> messageList) {

        this.messageList = messageList;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_layout_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Message messageLists = messageList.get(position);

        holder.txtAddress.setText(messageLists.getAddress());

        holder.txtDoctorName.setText(messageLists.getName());

    }

    @Override
    public int getItemCount() {

        return messageList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtDoctorName;
        public TextView txtAddress;

        public ViewHolder(View itemView) {

            super(itemView);

            txtDoctorName = (TextView) itemView.findViewById(R.id.txtDocName);
            txtAddress = (TextView) itemView.findViewById(R.id.txtAddress);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            System.out.println(messageList.get(getAdapterPosition()).getName());
            Intent feedInfo = new Intent(view.getContext(), Feed.class);
            feedInfo.putExtra("messageInfo_Name", messageList.get(getAdapterPosition()).getName());
            feedInfo.putExtra("messageInfo_Address", messageList.get(getAdapterPosition()).getAddress());
            view.getContext().startActivity(feedInfo);
        }
    }
}