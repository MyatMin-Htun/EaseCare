package com.example.easecare;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Feed extends AppCompatActivity {

    TextView feedInfo_Name, feedInfo_Content, feedInfo_Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);

        feedInfo_Name = (TextView)findViewById(R.id.authorname);
        feedInfo_Content = (TextView)findViewById(R.id.txtFeedContent);
        feedInfo_Title = (TextView)findViewById(R.id.txtFeedTitle);

        feedInfo_Name.setText(getIntent().getStringExtra("feedInfo_Name"));
        feedInfo_Content.setText(getIntent().getStringExtra("feedInfo_Content"));
        feedInfo_Title.setText(getIntent().getStringExtra("feedInfo_Title"));

    }
}