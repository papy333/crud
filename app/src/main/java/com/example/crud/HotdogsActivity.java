package com.example.crud;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HotdogsActivity extends AppCompatActivity {
    private Button btnSmall, btnMedium, btnLarge;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotdogs);

        btnSmall = findViewById(R.id.hotbtnSmall);
        btnMedium = findViewById(R.id.hotbtnMedium);
        btnLarge = findViewById(R.id.hotbtnLarge);

        // Implementa la funcionalidad para cada botón de perro caliente aquí
    }
}

