package com.example.tempconverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;

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
                double cel = Double.parseDouble(cto_fNumber.getText().toString());
                double fahrenheit = (cel * 9)/5 + 32;
                fahrenheit = Double.parseDouble(new DecimalFormat("##.##").format(fahrenheit));
                cto_fResult.setText("" + fahrenheit);
            }
        });

    }


}