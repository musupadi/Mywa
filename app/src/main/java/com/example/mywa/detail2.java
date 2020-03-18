package com.example.mywa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detail2 extends AppCompatActivity {
    private Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        btn5 = (Button) findViewById(R.id.konfirm);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(detail2.this, konfirm.class);
                startActivity(i);
            }
        });
    }
}