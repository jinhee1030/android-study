package com.kjh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        findViewById(R.id.btn4).setOnClickListener(mClick);
        findViewById(R.id.btn5).setOnClickListener(mClick);
        findViewById(R.id.btn6).setOnClickListener(mClick);
        findViewById(R.id.btn7).setOnClickListener(mClick);
        findViewById(R.id.btn8).setOnClickListener(mClick);
        findViewById(R.id.btn9).setOnClickListener(mClick);
        findViewById(R.id.btn10).setOnClickListener(mClick);
        findViewById(R.id.btn11).setOnClickListener(mClick);
        findViewById(R.id.btn12).setOnClickListener(mClick);
        findViewById(R.id.btn13).setOnClickListener(mClick);
        findViewById(R.id.btn14).setOnClickListener(mClick);
        findViewById(R.id.btn15).setOnClickListener(mClick);
        findViewById(R.id.btn16).setOnClickListener(mClick);
        findViewById(R.id.btn17).setOnClickListener(mClick);
        findViewById(R.id.btn18).setOnClickListener(mClick);
        findViewById(R.id.btn19).setOnClickListener(mClick);
        findViewById(R.id.btn20).setOnClickListener(mClick);
        findViewById(R.id.btn21).setOnClickListener(mClick);
        findViewById(R.id.btn22).setOnClickListener(mClick);
        findViewById(R.id.btn23).setOnClickListener(mClick);
        findViewById(R.id.btn24).setOnClickListener(mClick);
        findViewById(R.id.btn25).setOnClickListener(mClick);
        findViewById(R.id.btn26).setOnClickListener(mClick);
        findViewById(R.id.btn27).setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn1:
                    Intent ex1 = new Intent(MainActivity.this, Ex1AnimationActivity.class);
                    startActivity(ex1);
                    break;
                case R.id.btn2:
                    Intent ex2 = new Intent(MainActivity.this, Ex2GifActivity.class);
                    startActivity(ex2);
                    break;
                case R.id.btn3:
                    Intent ex3 = new Intent(MainActivity.this, Ex3VideoActivity.class);
                    startActivity(ex3);
                    break;
                case R.id.btn4:
                    Intent ex4 = new Intent(MainActivity.this, Ex4MediaActivity.class);
                    startActivity(ex4);
                    break;
                case R.id.btn5:
                    Intent ex5 = new Intent(MainActivity.this, Ex5WebViewActivity.class);
                    startActivity(ex5);
                    break;
                case R.id.btn6:
                    Intent ex6 = new Intent(MainActivity.this, Ex6TelActivity.class);
                    startActivity(ex6);
                    break;
                case R.id.btn7:
                    Intent ex7 = new Intent(MainActivity.this, Ex7SmsActivity.class);
                    startActivity(ex7);
                    break;
                case R.id.btn8:
                    Intent ex8 = new Intent(MainActivity.this, Ex8GalleryViewEx.class);
                    startActivity(ex8);
                    break;
                case R.id.btn9:
                    Intent ex9 = new Intent(MainActivity.this, Ex9ImageViewEx.class);
                    startActivity(ex9);
                    break;
                case R.id.btn10:
                    Intent ex10 = new Intent(MainActivity.this, Ex10PhoneCreate1Ex.class);
                    startActivity(ex10);
                    break;
                case R.id.btn11:
                    Intent ex11 = new Intent(MainActivity.this, Ex11ListViewEx.class);
                    startActivity(ex11);
                    break;
                case R.id.btn12:
                    Intent ex12 = new Intent(MainActivity.this, Ex12PhoneCreate2Ex.class);
                    startActivity(ex12);
                    break;
                case R.id.btn13:
                    Intent ex13 = new Intent(MainActivity.this, Ex13SpinnerEx.class);
                    startActivity(ex13);
                    break;
                case R.id.btn14:
                    Intent ex14 = new Intent(MainActivity.this, Ex14SwitchEx.class);
                    startActivity(ex14);
                    break;
                case R.id.btn15:
                    Intent ex15 = new Intent(MainActivity.this, Ex15SpinnerEx.class);
                    startActivity(ex15);
                    break;
                case R.id.btn16:
                    Intent ex16 = new Intent(MainActivity.this, Ex16IntentDataSendEx.class);
                    startActivity(ex16);
                    break;
                case R.id.btn17:
                    Intent ex17 = new Intent(MainActivity.this, Ex17IntentTest.class);
                    startActivity(ex17);
                    break;
                case R.id.btn18:
                    Intent ex18 = new Intent(MainActivity.this, Ex18SharedPreferencesEx.class);
                    startActivity(ex18);
                    break;
                case R.id.btn19:
                    Intent ex19 = new Intent(MainActivity.this, Ex19sharedpreferences2.class);
                    startActivity(ex19);
                    break;
                case R.id.btn20:
                    Intent ex20 = new Intent(MainActivity.this, Ex20Viewpager2Ex.class);
                    startActivity(ex20);
                    break;
                case R.id.btn21:
                    Intent ex21 = new Intent(MainActivity.this, Ex21HadlerEx.class);
                    startActivity(ex21);
                    break;
                case R.id.btn22:
                    Intent ex22 = new Intent(MainActivity.this, Ex22FragmentEx.class);
                    startActivity(ex22);
                    break;
                case R.id.btn23:
                    Intent ex23 = new Intent(MainActivity.this, Ex23CalcActivity.class);
                    startActivity(ex23);
                    break;
                case R.id.btn24:
                    Intent ex24 = new Intent(MainActivity.this, Ex24GpsMapEx.class);
                    startActivity(ex24);
                    break;
                case R.id.btn25:
                    Intent ex25 = new Intent(MainActivity.this, Ex25SQLiteExLogin.class);
                    startActivity(ex25);
                    break;
                case R.id.btn26:
                    Intent ex26 = new Intent(MainActivity.this, Ex26DDayEx.class);
                    startActivity(ex26);
                    break;
                case R.id.btn27:
                    Intent ex27 = new Intent(MainActivity.this, Ex27RecyclerViewEx.class);
                    startActivity(ex27);
                    break;



            }

        }
    };
}