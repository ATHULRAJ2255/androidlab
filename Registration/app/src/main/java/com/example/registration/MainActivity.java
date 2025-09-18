package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText name,pass,phn,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        pass=(EditText)findViewById(R.id.pass);
        phn=(EditText)findViewById(R.id.phone);
        age=(EditText)findViewById(R.id.age);
    }
    public void onResume() {
        super.onResume();
        SharedPreferences sh=getSharedPreferences("sp", MODE_PRIVATE);
        String s1 = sh.getString("name", "");
        String s2 = sh.getString("pass", "");
        int ph = sh.getInt("phone", 0);
        int a = sh.getInt("age", 0);
        name.setText(s1);
        pass.setText(s2);
        phn.setText(String.valueOf(ph));
        age.setText(String.valueOf(a));
    }
    public void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("sp",
                MODE_PRIVATE);
        SharedPreferences.Editor sp = sharedPreferences.edit();
        sp.putString("name", name.getText().toString());
        sp.putString("pass", pass.getText().toString());
        sp.putInt("age", Integer.parseInt(age.getText().toString()));
        sp.putInt("phone", Integer.parseInt(phn.getText().toString()));
        sp.commit();
        sp.apply();
    }
}

