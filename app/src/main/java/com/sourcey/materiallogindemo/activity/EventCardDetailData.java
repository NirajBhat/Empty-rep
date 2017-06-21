package com.sourcey.materiallogindemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sourcey.materiallogindemo.R;

public class EventCardDetailData extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_card_detail_data);
        recyclerView= (RecyclerView) findViewById(R.id.recycleview_event_card);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        
    }
}
