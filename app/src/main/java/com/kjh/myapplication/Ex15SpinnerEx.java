package com.kjh.myapplication;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex15SpinnerEx extends AppCompatActivity {
    TextView textView;

    String[] items = {"호올스", "목캔디", "폴로"};

    String temp = "";//스피너 선택값 저장변수

    ImageView ivImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex15_spinner2);

        textView = (TextView) findViewById(R.id.tvSel);
        ivImg = (ImageView) findViewById(R.id.ivImg);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        spinner.setAdapter(adapter);

        // 스피너에서 선택 했을 경우 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);

                temp = items[position];
                Log.d("스피너테스트2", "선택값 저장된 변수 temp : " + temp);
                //문자열비교로할경우
//                if(items[position].equals("호올스"))
//                {
//                    ivImg.setImageResource(R.drawable.hallscand);
//                }
//                else if(items[position].equals("목캔디"))
//                {
//                    ivImg.setImageResource(R.drawable.neckcand);
//                }else if(items[position].equals("폴로"))
//                {
//                    ivImg.setImageResource(R.drawable.polo);
//                }
                //인덱스 position으로 비교할경우
                if(position == 0){ivImg.setImageResource(R.drawable.hallscand);  }
                else if(position == 1){ivImg.setImageResource(R.drawable.neckcand);  }
                else if(position == 2){ivImg.setImageResource(R.drawable.polo);  }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("선택 : ");
            }
        });

    }
}