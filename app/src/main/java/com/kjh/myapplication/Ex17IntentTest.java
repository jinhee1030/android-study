package com.kjh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ex17IntentTest extends AppCompatActivity {

    EditText etName, etAge, etTell, etAddr;

    String dataName, dataAge, dataTell, dataAddr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex17intent_test);

        //초기값을 셋팅
        dataName = "noName";
        dataAge = "0";
        dataTell = "noTell";
        dataAddr = "noAddr";

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etTell = (EditText) findViewById(R.id.etTell);
        etAddr = (EditText) findViewById(R.id.etAddr);

        findViewById(R.id.btnSand).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.btnSand:

                        //입력한 값이 공백이 아닐경우에 가져옴....
                        if(!etName.getText().toString().equals("")) // 에디트 텍스트에 공백이 아닐 경우 위에 초기값 세팅한걸 불러오게 됨.
                        { dataName = etName.getText().toString();}
                        if(!etAge.getText().toString().equals(""))
                        { dataAge = etAge.getText().toString();}
                        if(!etTell.getText().toString().equals(""))
                        { dataTell = etTell.getText().toString();}
                        if(!etAddr.getText().toString().equals(""))
                        { dataAddr = etAddr.getText().toString();}

                        Intent ex17 = new Intent(Ex17IntentTest.this, Ex17IntentSud.class);
                        ex17.putExtra("dataName",dataName);
                        ex17.putExtra("dataAge",dataAge);
                        ex17.putExtra("dataTell",dataTell);
                        ex17.putExtra("dataAddr",dataAddr);
                        startActivity(ex17);
                        break;
                }

            }
        };
    }