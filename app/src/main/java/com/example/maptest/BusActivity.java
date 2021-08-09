package com.example.maptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusActivity extends AppCompatActivity {

    private Button result_backbt;
    private Button result_trainbt2;
    private Button result_airplanebt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        result_backbt = findViewById(R.id.result_backbt);
        result_backbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusActivity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        result_trainbt2 = findViewById(R.id.result_trainbt2);
        result_trainbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusActivity.this, TrainActivity.class);
                startActivity(intent);
            }
        });

        result_airplanebt2 = findViewById(R.id.result_airplanebt2);
        result_airplanebt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusActivity.this, AirplaneActivity.class);
                startActivity(intent);
            }
        });
    }
}