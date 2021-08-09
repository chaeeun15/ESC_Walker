package com.example.maptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AirplaneActivity extends AppCompatActivity {

    private Button result_backbt;
    private Button result_busbt4;
    private Button result_trainbt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airplane);

        result_backbt = findViewById(R.id.result_backbt);
        result_backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AirplaneActivity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        result_busbt4 = findViewById(R.id.result_busbt4);
        result_busbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AirplaneActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });

        result_trainbt4 = findViewById(R.id.result_trainbt4);
        result_trainbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AirplaneActivity.this, TrainActivity.class);
                startActivity(intent);
            }
        });
    }
}