package com.example.navigate;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void buttonBack(View view){
        Intent i2 = new Intent(activity_second.this, MainActivity.class);
        startActivity(i2);
    }
}