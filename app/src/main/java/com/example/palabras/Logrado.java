package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Logrado extends AppCompatActivity {
    Button BS, BV;
    ImageView E1,E2,E3,L;
    TextView F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logrado);
        BS = (Button) findViewById(R.id.button9);
        BV = (Button) findViewById(R.id.button8);
        E1 = (ImageView) findViewById(R.id.imageView7);
        E2 = (ImageView) findViewById(R.id.imageView8);
        E3 =(ImageView) findViewById(R.id.imageView5);
        L = (ImageView) findViewById(R.id.imageView4);
        F = (TextView) findViewById(R.id.textView8);
        this.BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        this.BV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent i = new Intent(Logrado.this,MainActivity.class);
                startActivity(i);
            }
        });

    }}
