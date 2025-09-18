package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
    public class MainActivity extends AppCompatActivity {
        EditText etresult;
        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, btplus, btminus, btmul, btdiv, btcan, bteq;
        float temp1, temp2;
        String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etresult = (EditText) findViewById(R.id.etc1);
        btplus = (Button) findViewById(R.id.btplus);
        btminus = (Button) findViewById(R.id.btminus);
        btmul = (Button) findViewById(R.id.btmul);
        btdiv = (Button) findViewById(R.id.btdiv);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        btcan = (Button) findViewById(R.id.btcan);
        bteq = (Button) findViewById(R.id.bteq);

    }

        public void onclick(View v) {
            if (v == btplus || v == btminus || v == btmul || v == btdiv) {

                temp1 = Float.parseFloat(etresult.getText().toString());
                etresult.setText("".toString());
                Button b = (Button) v;
                op = b.getText().toString();
                //temp2 = Float.parseFloat(etresult.getText().toString());
            }

            if (v == bteq) {
                temp2 = Float.parseFloat(etresult.getText().toString());
                if (op.equals("+"))
                    etresult.setText("" + (temp1 + temp2));
                else if (op.equals("-"))
                    etresult.setText("" + (temp1 - temp2));
                else if (op.equals("*"))
                    etresult.setText("" + (temp1 * temp2));
                else if (op.equals("/"))
                    etresult.setText("" + (temp1 / temp2));
            }
            if (v == btcan) {
                etresult.setText("".toString());
            }
        }

        public void onnum(View v)
        {
            String str=etresult.getText().toString();
            Button numb=(Button) v;
            String num=numb.getText().toString();
            etresult.setText(str+num);
        }

    }