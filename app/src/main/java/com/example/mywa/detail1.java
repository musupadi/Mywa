package com.example.mywa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detail1 extends AppCompatActivity {
    private Button btndet1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        btndet1 = (Button) findViewById(R.id.konfirm);
        btndet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(detail1.this, konfirm.class);
                startActivity(i);
            }
        });
    }
}
