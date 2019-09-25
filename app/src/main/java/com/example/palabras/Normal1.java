package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Normal1 extends AppCompatActivity {
    Button BN;
    TextView TN;
    ImageView IN;
    EditText EN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal1);
        BN  = (Button) findViewById(R.id.button4);
        TN  = (TextView) findViewById(R.id.textView5);
        IN  = (ImageView) findViewById(R.id.imageView2);
        EN  = (EditText) findViewById(R.id.editTextNormal);
    }
}
