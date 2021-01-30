package com.example.tempconverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showCToF = new Intent(getApplicationContext(), cTof.class);
                showCToF.putExtra("com.example.tempconverseapp.ITEM_INDEX", position);
                startActivity(showCToF);

            }
        });
    }
}