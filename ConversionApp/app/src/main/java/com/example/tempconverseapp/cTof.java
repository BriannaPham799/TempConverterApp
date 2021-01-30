package com.example.tempconverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class cTof extends AppCompatActivity {

    EditText cto_fNumber;
    TextView CtoF, cto_fResult, fah;
    ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_tof);

        //Instantiating Widgets

        CtoF = findViewById(R.id.CtoF);
        cto_fResult = findViewById(R.id.ctofResult);
        fah = findViewById(R.id.fah);
        cto_fNumber = findViewById(R.id.ctofNumber);

        button = findViewById(R.id.Button1);

        //Adding button activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Doing converting from Celsius to Fahrenheit
                ConvertCToF();
            }
        });

    }

    private void ConvertCToF() {
        String celsiusValue = cto_fNumber.getText().toString();
        double cel = Double.parseDouble(celsiusValue);
        double fahrenheit = cel*1.8 + 32;
        cto_fResult.setText("" + fahrenheit);
    }
}