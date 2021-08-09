package com.example.maptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ResultActivity extends AppCompatActivity {

    private Button result_backbt;
    private Button result_busbt;
    private Button result_trainbt;
    private Button result_airplanebt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result_backbt = findViewById(R.id.result_backbt);
        result_backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        result_busbt = findViewById(R.id.result_busbt);
        result_busbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });

        result_trainbt = findViewById(R.id.result_trainbt);
        result_trainbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, TrainActivity.class);
                startActivity(intent);
            }
        });

        result_airplanebt = findViewById(R.id.result_airplanebt);
        result_airplanebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, AirplaneActivity.class);
                startActivity(intent);
            }
        });
    }
}