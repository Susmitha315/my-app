package com.example.myapp;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.textView3);
        Button b1 = findViewById(R.id.button2);
        Button b2 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setTextSize(60);
                Toast.makeText(MainActivity.this,"Font size has changed",Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setTextColor(Color.BLACK);
                Toast.makeText(MainActivity.this,"Font color has changed",Toast.LENGTH_LONG).show();
            }
        });


    }
}