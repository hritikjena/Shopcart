package com.hritikjn6.shopcart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        // 👇 Add this block for the Next button
        Button getStartedBtn = findViewById(R.id.getStartedBtn);
        getStartedBtn.setOnClickListener(v -> {
            Intent intent = new Intent(splash_screen.this, login_Activity.class);
            startActivity(intent);
            finish(); // Optional: closes splash screen activity
        });

        // This part adjusts padding for system bars (already in your code)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}