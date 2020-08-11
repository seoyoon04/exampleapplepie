package com.example.weather01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
public class MainActivity extends AppCompatActivity {

    private static final String OPEN_WEATHER_MAP_URL = "";
    private static final String OPEN_WEATHER_MAP_API = "";

    TextView cityField

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}