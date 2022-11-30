package com.kjh.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Ex9ImageViewEx extends AppCompatActivity {
        ImageView ivImg2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ex9_img);

            ivImg2 = (ImageView)findViewById(R.id.ivImg2);

            findViewById(R.id.ivImg1).setOnClickListener(mClick);
        }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.ivImg1:
                    ivImg2.setImageResource(R.drawable.cute);
                    Toast.makeText(Ex9ImageViewEx.this,"아래 이미지 복사 변경!",Toast.LENGTH_SHORT).show();
                    break;

            }

        }
    };

    }