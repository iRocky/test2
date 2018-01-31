package com.example.poly.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.example.poly.test2.R;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText etnumberone;
    private AppCompatEditText etnumbertwo;
    private AppCompatEditText btplus;
    private AppCompatEditText btminus;
    private AppCompatEditText btmultiply;
    private AppCompatEditText btdivide;
    private AppCompatTextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumberone = findViewById(R.id.etnumberone);
        etnumbertwo = findViewById(R.id.etnumbertwo);
        btplus = findViewById(R.id.btplus);
        btminus = findViewById(R.id.btminus);
        btmultiply = findViewById(R.id.btmultiply);
        btdivide = findViewById(R.id.btdivide);
        tvResult = findViewById(R.id.tvResult);

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberone = etnumberone.getText().toString();
                String numbertwo = etnumbertwo.getText().toString();
                int result = plus(Integer.parseInt(numberone),Integer.parseInt(numbertwo));
                tvResult.setText(String.valueOf(result));
            }
        });

        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private int plus (int x,int y){
        return x+y;
    }
    private int minus (int x,int y){
        return x-y;
    }
    private int multiply (int x,int y){
        return x*y;
    }
    private int divide (int x,int y){
        return x/y;
    }
}
