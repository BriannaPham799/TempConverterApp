package com.example.tempconverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class fToc extends AppCompatActivity {

    EditText fto_cNumber;
    TextView FtoC, fto_cResult, cel;
    ImageButton button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_toc);

        //Instantiating Widgets

        FtoC = findViewById(R.id.FToC);
        fto_cResult = findViewById(R.id.fTocResult);
        cel = findViewById(R.id.cel);
        fto_cNumber = findViewById(R.id.ftocNumber);

        button1 = findViewById(R.id.Button2);

        //Adding button activity
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fahNumber = Double.parseDouble(fto_cNumber.getText().toString());
                double celNumber = (fahNumber - 32) * 5/9;
                celNumber = Double.parseDouble(new DecimalFormat("##.##").format(celNumber));
                fto_cResult.setText("" + celNumber);
            }
        });

    }
}