package com.shenal.googlemaps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                navigateToMap();
            }
        });

        Button btnLineChart = findViewById(R.id.btnLineChart);
        btnLineChart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                navigateToLineChart();
            }
        });

        Button tempbutton = findViewById(R.id.temperature);
        tempbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtempdata();
            }
        });

        Button oxygenbutton = findViewById(R.id.oxygen);
        oxygenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showoxydata();
            }
        });

    }

    public void showtempdata() {
        Intent intent = new Intent(this, Temp_Data.class);
        startActivity(intent);
    }

    public void showoxydata() {
        Intent intent = new Intent(this, Oxy_Data.class);
        startActivity(intent);
    }

    public void navigateToMap() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void navigateToLineChart() {
        Intent intent = new Intent(this, LineChartActivity.class);
        startActivity(intent);
    }

}

