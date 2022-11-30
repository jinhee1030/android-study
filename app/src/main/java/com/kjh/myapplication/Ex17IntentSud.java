package com.kjh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Ex17IntentSud extends AppCompatActivity {

    TextView tvRename, tvReage, tvRetell, tvReaddr;

    String dataName, dataAge, dataTell, dataAddr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex17intent_sud);

            tvRename = (TextView) findViewById(R.id.tvRename);
            tvReage = (TextView) findViewById(R.id.tvReage);
            tvRetell = (TextView) findViewById(R.id.tvRetell);
            tvReaddr = (TextView) findViewById(R.id.tvReaddr);

            Intent getIntent = getIntent();
            dataName = getIntent.getStringExtra("dataName");
            dataAge = getIntent.getStringExtra("dataAge");
            dataTell = getIntent.getStringExtra("dataTell");
            dataAddr = getIntent.getStringExtra("dataAddr");

            tvRename.setText(dataName);
            tvReage.setText(dataAge+"세");
            tvRetell.setText(dataTell);
            tvReaddr.setText(dataAddr);


    }
}

