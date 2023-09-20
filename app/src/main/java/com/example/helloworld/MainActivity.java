package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int n = 0, aux, MIN =1 , MAX = 4;
    Random RANDOM = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtChangeTextClick(View v)
    {
        tv = (TextView)findViewById(R.id.tv_main_label);
        ++n;

        if(n<2)
            tv.setText("1º LAB of Mobile Application Development Techniques.");
        else
            tv.setText("Is the "+n+"º time that you change the text");

    }

    public void onBtChangeColor(View v)
    {

        aux = RANDOM.nextInt(MAX-MIN)+MIN;
        tv = (TextView)findViewById(R.id.tv_main_label);

        switch (aux){
            case 1:tv.setTextColor(Color.LTGRAY); break;
            case 2:tv.setTextColor(Color.YELLOW);break;
            case 3:tv.setTextColor(Color.MAGENTA);break;
            default:tv.setTextColor(Color.GREEN);

        }
    }

}