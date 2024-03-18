package com.example.laba51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button buttonred;
Button buttonblue;
Button buttonyellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonred = (Button) findViewById(R.id.buttonred);
        buttonblue = (Button) findViewById(R.id.buttonblue);
        buttonyellow = (Button) findViewById(R.id.buttonyellow);
        Intent intentblue = new Intent(this, MainActivityblue.class);
        Intent intentred = new Intent(this, MainActivityred.class);
        Intent intentyellow = new Intent(this, MainActivityyellow.class);
        buttonred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentred);
            }
        });
        buttonyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentyellow);

            }
        });
        buttonblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentblue);
            }
        });
    }
}