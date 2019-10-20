package com.example.easecare;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MessageServiceLayout extends AppCompatActivity {

    ArrayList<MessageService> messageServiceList = new ArrayList<>();

    RecyclerView recyclerView;

    RecyclerView.Adapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_service_layout);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MessageService messageService = new MessageService();
        messageService.setQuestion("Still have fever over 104'F?");
        messageService.setAnswer("Yes!");
        messageServiceList.add(messageService);

        messageService = new MessageService();
        messageService.setQuestion("Still have Headache?");
        messageService.setAnswer("Yes!");
        messageServiceList.add(messageService);

        messageService = new MessageService();
        messageService.setQuestion("Still have Pain in the back side of the eyes?");
        messageService.setAnswer("No!");
        messageServiceList.add(messageService);

        messageService = new MessageService();
        messageService.setQuestion("Still Vomiting?");
        messageService.setAnswer("Yes!");
        messageServiceList.add(messageService);

        adapter = new RecyclerViewAdapter_MessagingService(this, messageServiceList);
        recyclerView.setAdapter(adapter);

    }
}