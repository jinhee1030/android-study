package com.kjh.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.kjh.myapplication.R;

public class Ex2GifActivity extends AppCompatActivity {

    ImageView ivTest,ivTest2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_gif);

        ivTest = (ImageView)findViewById(R.id.imageView);
        ivTest2 = (ImageView)findViewById(R.id.imageView2);
        Glide.with(Ex2GifActivity.this).load(R.drawable.cute1).into(ivTest);
        Glide.with(Ex2GifActivity.this).load(R.drawable.cute1).into(ivTest2);

    }


}