package com.example.crud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private Button btnHotdogs, btnBurgers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnHotdogs = findViewById(R.id.btnHotDogs);
        btnBurgers = findViewById(R.id.btnBurgers);

        btnHotdogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, HotdogsActivity.class);
                startActivity(intent);
            }
        });

        btnBurgers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, BurgersActivity.class);
                startActivity(intent);
            }
        });
    }
}

