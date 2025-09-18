package com.example.prgm10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        String[] countries = getResources().getStringArray(R.array.array_countries);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.spinner_layout,
                R.id.text,
                countries
        );

        spinner.setAdapter(adapter);
    }
}