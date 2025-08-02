package com.hritikjn6.shopcart;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.Gravity;
import android.view.View;
import android.graphics.Color;
import android.widget.Toast;
import android.view.ViewGroup;
import android.view.Gravity;
import android.graphics.Color;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        LinearLayout catElectronics = findViewById(R.id.catElectronics);
        LinearLayout catFashion = findViewById(R.id.catFashion);
        LinearLayout catHome = findViewById(R.id.catHome);
        LinearLayout catBooks = findViewById(R.id.catBooks);

        catElectronics.setOnClickListener(v -> {
            Toast.makeText(this, "Electronics clicked", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(this, ElectronicsActivity.class));
        });

        catFashion.setOnClickListener(v -> {
            Toast.makeText(this, "Fashion clicked", Toast.LENGTH_SHORT).show();
        });

        catHome.setOnClickListener(v -> {
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show();
        });

        catBooks.setOnClickListener(v -> {
            Toast.makeText(this, "Books clicked", Toast.LENGTH_SHORT).show();
        });
    }
}