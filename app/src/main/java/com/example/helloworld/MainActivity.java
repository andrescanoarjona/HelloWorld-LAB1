package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int n = 0, mem = 4;
    int aux;
    private static final int MIN =1 , MAX = 5;
    Random RANDOM = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv_main_label);
    }
    @SuppressLint("SetTextI18n")
    public void onBtChangeTextClick(View v) {
        ++n;

        if(n<2) {
            tv.setText("1º LAB of Mobile Application Development Techniques.");
        }
        else {
            tv.setText("Is the " + n + "º time that you change the text");
        }
    }

    public void onBtChangeColor(View v)
    {

        do {
            aux = RANDOM.nextInt(MAX - MIN) + MIN;
        }while(mem == aux);
        mem = aux;

        switch (aux){
            case 1: {
                tv.setTextColor(Color.GREEN);
                break;
            }
            case 2:{
                tv.setTextColor(Color.BLUE);
                break;
            }
            case 3:{
                tv.setTextColor(Color.MAGENTA);
                break;}
            default:{
                tv.setTextColor(Color.BLACK);
            }

        }
    }

}