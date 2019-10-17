package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button,button6;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.Nombre);
        button6 = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick( View view){
            enviar();
        }


    });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Acerca_de.class);
                startActivity(i);
            }
        });
}
    public void enviar(){
        Intent i = new Intent(MainActivity.this,activity_2.class);
        i.putExtra("valor",editText.getText().toString());
        startActivity(i);
    }
}
