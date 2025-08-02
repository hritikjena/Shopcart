package com.hritikjn6.shopcart;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login_Activity extends AppCompatActivity {

    EditText emailInput = findViewById(R.id.emailEditText);
    EditText passwordInput = findViewById(R.id.passwordEditText);
    Button loginBtn, signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Bind views
        emailInput = findViewById(R.id.emailEditText);
        passwordInput = findViewById(R.id.passwordEditText);
        loginBtn = findViewById(R.id.loginButton);
        signUpButton = findViewById(R.id.signUpButton);

        // 👉 Login Button Logic
        loginBtn.setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (email.equals("admin@gmail.com") && password.equals("123456")) {
                Intent intent = new Intent(login_Activity.this, HomePageActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });

        // 👉 Go to SignUp Page
        signUpButton.setOnClickListener(view -> {
            Intent intent = new Intent(login_Activity.this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}