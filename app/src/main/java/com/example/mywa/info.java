package com.example.mywa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Button btn1 = (Button) findViewById(R.id.button3);
        btn2 = (Button) findViewById(R.id.button9);
        btn3 = (Button) findViewById(R.id.button5);
        btn4 = (Button) findViewById(R.id.button6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(info.this, detail1.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(info.this, detail2.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(info.this, detail3.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(info.this, detail4.class);
                startActivity(i);
            }
        });
    }
}

