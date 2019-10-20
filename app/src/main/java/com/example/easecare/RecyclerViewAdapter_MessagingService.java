package com.example.easecare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter_MessagingService extends RecyclerView.Adapter<RecyclerViewAdapter_MessagingService.ViewHolder> {

    Context context;
    ArrayList<MessageService> messageServiceList;

    public RecyclerViewAdapter_MessagingService(Context context, ArrayList<MessageService> messageServiceList) {

        this.messageServiceList = messageServiceList;

        this.context = context;
    }

    @Override
    public RecyclerViewAdapter_MessagingService.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_service_layout_item, parent, false);

        RecyclerViewAdapter_MessagingService.ViewHolder viewHolder = new RecyclerViewAdapter_MessagingService.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter_MessagingService.ViewHolder holder, int position) {

        MessageService messageServiceLists = messageServiceList.get(position);

        holder.txtQuestion.setText(messageServiceLists.getQuestion());

        holder.txtAnswer.setText(messageServiceLists.getAnswer());

    }

    @Override
    public int getItemCount() {

        return messageServiceList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtQuestion;
        public TextView txtAnswer;

        public ViewHolder(View itemView) {

            super(itemView);

            txtQuestion = (TextView) itemView.findViewById(R.id.txtQuestion);
            txtAnswer = (TextView) itemView.findViewById(R.id.txtAnswer);
        }
    }
}