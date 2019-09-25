package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Dificil1 extends AppCompatActivity {
    Button BF;
    TextView TF;
    ImageView IF;
    EditText EF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificil1);
        BF  = (Button) findViewById(R.id.button5);
        TF  = (TextView) findViewById(R.id.textView6);
        IF  = (ImageView) findViewById(R.id.imageView3);
        EF  = (EditText) findViewById(R.id.editTextdificil);
    }
}
