package com.example.appzest;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        RecyclerView tabRecyclerView = findViewById(R.id.tabRecyclerView);
        List<tabModel> tabList = new ArrayList<>();
        tabList.add(new tabModel("Home"));
        tabList.add(new tabModel("Earn"));
        tabList.add(new tabModel("Wallet"));
        tabList.add(new tabModel("Tasks"));
        tabList.add(new tabModel("Rewards"));
        tabList.add(new tabModel("Offers"));

        tabAdapter tabAdapter = new tabAdapter(tabList, this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        tabRecyclerView.setLayoutManager(layoutManager);
        tabRecyclerView.setAdapter(tabAdapter);

    }
}