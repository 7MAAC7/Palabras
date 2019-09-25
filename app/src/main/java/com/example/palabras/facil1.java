package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class facil1 extends AppCompatActivity {
    Button B;
    TextView T;
    ImageView I;
    EditText E;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facil1);
        B  = (Button) findViewById(R.id.button3);
        T  = (TextView) findViewById(R.id.textView4);
        I  = (ImageView) findViewById(R.id.imageView);
        E  = (EditText) findViewById(R.id.editfacil1);
    }
}
