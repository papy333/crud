package com.example.crud;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BurgersActivity extends AppCompatActivity {
    private Button btnSmall, btnMedium, btnLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers);

        btnSmall = findViewById(R.id.burbtnSmall);
        btnMedium = findViewById(R.id.burbtnMedium);
        btnLarge = findViewById(R.id.burbtnLarge);

        // Implementa la funcionalidad para cada botón de hamburguesa aquí
    }
}

