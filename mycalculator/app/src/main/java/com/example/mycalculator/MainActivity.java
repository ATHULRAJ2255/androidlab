package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Button btplus, btminus, btmul, btdiv, btcan, bteq;
    private EditText etresult;

    private float temp1 = 0, temp2 = 0;
    private String op = "";
    private boolean isOpClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etresult = findViewById(R.id.etresult);
        // Disable keyboard popping up
        etresult.setShowSoftInputOnFocus(false);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        btplus = findViewById(R.id.btplus);
        btminus = findViewById(R.id.btminus);
        btmul = findViewById(R.id.btmul);
        btdiv = findViewById(R.id.btdiv);
        btcan = findViewById(R.id.btcan);
        bteq = findViewById(R.id.bteq);

        // Set listeners
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        btplus.setOnClickListener(this);
        btminus.setOnClickListener(this);
        btmul.setOnClickListener(this);
        btdiv.setOnClickListener(this);
        btcan.setOnClickListener(this);
        bteq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // If digit clicked
        if (v == b0 || v == b1 || v == b2 || v == b3 || v == b4 || v == b5 || v == b6 || v == b7 || v == b8 || v == b9) {
            Button btn = (Button) v;
            if (isOpClicked) {
                etresult.setText("");  // clear before new number input
                isOpClicked = false;
            }
            etresult.append(btn.getText());
        }
        // Operator buttons
        else if (v == btplus || v == btminus || v == btmul || v == btdiv) {
            String currentText = etresult.getText().toString();
            if (!currentText.isEmpty()) {
                try {
                    temp1 = Float.parseFloat(currentText);
                } catch (NumberFormatException e) {
                    temp1 = 0;
                }
            }
            Button btn = (Button) v;
            op = btn.getText().toString();
            isOpClicked = true;
        }
        // Equals button
        else if (v == bteq) {
            String currentText = etresult.getText().toString();
            if (!currentText.isEmpty()) {
                try {
                    temp2 = Float.parseFloat(currentText);
                } catch (NumberFormatException e) {
                    temp2 = 0;
                }
            }
            float result = 0;
            boolean error = false;

            switch (op) {
                case "+":
                    result = temp1 + temp2;
                    break;
                case "-":
                    result = temp1 - temp2;
                    break;
                case "*":
                    result = temp1 * temp2;
                    break;
                case "/":
                    if (temp2 != 0) {
                        result = temp1 / temp2;
                    } else {
                        etresult.setText("Error: Div by 0");
                        error = true;
                    }
                    break;
                default:
                    etresult.setText("Select Operator");
                    error = true;
                    break;
            }

            if (!error) {
                etresult.setText(String.valueOf(result));
                op = "";
                isOpClicked = true;
            }
        }
        // Cancel button clears everything
        else if (v == btcan) {
            etresult.setText("");
            temp1 = 0;
            temp2 = 0;
            op = "";
            isOpClicked = false;
        }
    }
}
