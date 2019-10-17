package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Acerca_de extends AppCompatActivity {
    TextView textView7;
    Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        textView7 = (TextView) findViewById(R.id.textView7);
        button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Acerca_de.this,Mapa_de_ubicacion.class);
                startActivity(i);
        }

    });
    }
}