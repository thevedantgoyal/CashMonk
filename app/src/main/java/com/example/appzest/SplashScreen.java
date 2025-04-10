package com.example.appzest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreen extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        mAuth = FirebaseAuth.getInstance();

        new Handler().postDelayed(() -> {
            if (mAuth.getCurrentUser() != null) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            } else {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));
            }
            finish();
        }, 3000);
    }
}
