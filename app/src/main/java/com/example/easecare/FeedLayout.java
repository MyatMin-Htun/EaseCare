package com.example.easecare;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.google.firebase.database.DatabaseError;

public class FeedLayout extends Fragment {

    DatabaseReference databaseReference;

    // Feed from Firebase Database.
    public static final String Database_Path = "feed/19102019";

    ProgressDialog progressDialog;
    ArrayList<FeedNews> feedList = new ArrayList<>();

    RecyclerView recyclerView;

    RecyclerView.Adapter adapter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.feed_layout,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

//        progressDialog = new ProgressDialog(getActivity());
//
//        progressDialog.setMessage("Loading News. Please wait");
//
//        progressDialog.show();

        FeedNews feedNews = new FeedNews();
        feedNews.setName("a");
        feedNews.setContent("a");
        feedNews.setTitle("a");
        feedList.add(feedNews);

        feedNews = new FeedNews();
        feedNews.setName("b");
        feedNews.setContent(getString(R.string.paragraph));
        feedNews.setTitle("b");
        feedList.add(feedNews);

        feedNews = new FeedNews();
        feedNews.setName("c");
        feedNews.setContent("c");
        feedNews.setTitle("c");
        feedList.add(feedNews);

        adapter = new RecyclerViewAdapter(getActivity(), feedList);
        recyclerView.setAdapter(adapter);


//        databaseReference = FirebaseDatabase.getInstance().getReference("easecase-8377f");
//
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot snapshot) {
//                System.out.println("onChangeWork");
//                System.out.println(snapshot.getChildrenCount());
//                System.out.println("onChangeWork1");
//                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
//
//                    System.out.println("Inside Data");
//                    FeedNews feedNews = dataSnapshot.getValue(FeedNews.class);
//                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +feedNews.toString());
//                    feedList.add(feedNews);
//                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +feedList.get(0).toString());
//                }
//
//                adapter = new RecyclerViewAdapter(getActivity(), feedList);
//
//                recyclerView.setAdapter(adapter);
//
//                progressDialog.dismiss();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//                System.out.println("shit");
//                progressDialog.dismiss();
//            }
//        });

        return view;
    }
}