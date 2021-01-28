package com.example.temparatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView myList;
    String[] tempUnits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myList = (ListView) findViewById(R.id.myList);
        tempUnits = res.getStringArray(R.array.tempUnits);

        tempUnitAdapter unitAdapter = new tempUnitAdapter(this, tempUnits);
        myList.setAdapter(unitAdapter);
    }
}