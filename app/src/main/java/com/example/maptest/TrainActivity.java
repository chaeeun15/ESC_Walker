package com.example.maptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrainActivity extends AppCompatActivity {

    private Button result_backbt;
    private Button result_busbt3;
    private Button result_airplanebt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        result_backbt = findViewById(R.id.result_backbt);
        result_backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrainActivity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        result_busbt3 = findViewById(R.id.result_busbt3);
        result_busbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrainActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });

        result_airplanebt3 = findViewById(R.id.result_airplanebt3);
        result_airplanebt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrainActivity.this, AirplaneActivity.class);
                startActivity(intent);
            }
        });
    }
}