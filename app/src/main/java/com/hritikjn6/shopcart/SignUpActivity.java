package com.hritikjn6.shopcart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        // Handle system bar insets (optional)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signupLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 🔥 This part must be OUTSIDE of the insets listener
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpActivity.this, login_Activity.class);
            startActivity(intent);
            finish(); // close signup page if needed
        });
    }
}