package com.example.appzest;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class IntroActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private introPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);

        viewPager = findViewById(R.id.viewPager);
        adapter = new introPageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}