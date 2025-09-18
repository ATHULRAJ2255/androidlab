package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;

    Button b1;

    int count=4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.etuser);
        t2 = (EditText) findViewById(R.id.etpwd);
        b1 = (Button) findViewById(R.id.btlogin);
    }
        public void click(View v)

        {

                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                if(s1.equals("Athul") && s2.equals("Athul1"))
                {

                    Toast t;
                t=Toast.makeText(getApplicationContext(), "You are a valid user",

                Toast.LENGTH_LONG);

        t.show();

                }

                else {

                    count--;
                     if(count==0)

                     {

                        Toast.makeText(getApplicationContext(), "No more attempt is possible", Toast.LENGTH_LONG).show();

        b1.setEnabled(false);
         }
        else

        Toast.makeText(getApplicationContext(), "Not a valid user", Toast.LENGTH_LONG).show();
        }
        }
        }