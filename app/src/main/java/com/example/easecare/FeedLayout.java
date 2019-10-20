package com.example.easecare;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

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
        feedNews.setName("Dr.Yu Ya Myo");
        feedNews.setContent("Malaria can often be avoided using the ABCD approach to prevention, which stands for:\n" +
                "\n" +
                "    Awareness of risk – find out whether you're at risk of getting malaria.\n" +
                "    Bite prevention – avoid mosquito bites by using insect repellent, covering your arms and legs, and using a mosquito net.\n" +
                "    Check whether you need to take malaria prevention tablets – if you do, make sure you take the right antimalarial tablets at the right dose, and finish the course.\n" +
                "    Diagnosis – seek immediate medical advice if you have malaria symptoms, including up to a year after you return from travelling.\n");
        feedNews.setTitle("Malaria Prevention");
        feedList.add(feedNews);

        feedNews = new FeedNews();
        feedNews.setName("Dr.Aye Pa Pa");
        feedNews.setContent("The symptoms of malaria typically develop within 10 days to 4 weeks following the infection. In some cases, symptoms may not develop for several months. Some malarial parasites can enter the body but will be dormant for long periods of time.\n" +
                "\n" +
                "Common symptoms of malaria include:\n" +
                "\n" +
                "    shaking chills that can range from moderate to severe\n" +
                "    high fever\n" +
                "    profuse sweating\n" +
                "    headache\n" +
                "    nausea\n" +
                "    vomiting\n" +
                "    abdominal pain\n" +
                "    diarrhea\n" +
                "    anemia\n" +
                "    muscle pain\n" +
                "    convulsions\n" +
                "    coma\n" +
                "    bloody stools");
        feedNews.setTitle("Symptoms of Malaria!");
        feedList.add(feedNews);

        feedNews = new FeedNews();
        feedNews.setName("Dr.Mya Kwar nyo");
        feedNews.setContent("Treatment aims to eliminate the Plasmodium parasite from the bloodstream.\n" +
                "\n" +
                "Those without symptoms may be treated for infection to reduce the risk of disease transmission in the surrounding population.\n" +
                "\n" +
                "The World Health Organization (WHO) recommends artemisinin-based combination therapy (ACT) to treat uncomplicated malaria.\n" +
                "\n" +
                "Artemisinin is derived from the plant Artemisia annua, better known as sweet wormwood. It rapidly reduces the concentration of Plasmodium parasites in the bloodstream.\n" +
                "\n" +
                "Practitioners often combine ACT with a partner drug. ACT aims to reduce the number of parasites within the first 3 days of infection, while the partner drugs eliminate the rest.\n" +
                "\n" +
                "Expanding access to ACT treatment worldwide has helped reduce the impact of malaria, but the disease is becoming increasingly resistant to the effects of ACT.\n" +
                "\n" +
                "In places where malaria is resistant to ACT, treatment must contain an effective partner drug.\n" +
                "\n" +
                "The WHO has warned that no alternatives to artemisinin are likely to become available for several years.");
        feedNews.setTitle("Treatment for Malaria");
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