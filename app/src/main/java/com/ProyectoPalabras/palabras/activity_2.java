package com.ProyectoPalabras.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class activity_2 extends AppCompatActivity {
    TextView T2;
    TextView T3;
    RadioButton R1;
    RadioButton R2;
    RadioButton R3;
    Button B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        T2 = (TextView) findViewById(R.id.textView2);
        T3 = (TextView) findViewById(R.id.textView3);
        R1 = (RadioButton) findViewById(R.id.radioButton);
        R2 = (RadioButton) findViewById(R.id.radioButton2);
        R3 = (RadioButton) findViewById(R.id.radioButton3);
        B2 = (Button) findViewById(R.id.button2);
        Intent i = this.getIntent();
        Bundle extra = i.getExtras();
        String cadena = extra.getString("valor");
        T2.setText(cadena);

        B2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Toast t = Toast.makeText(activity_2.this, "ERROR, Seleccione un Nivel", Toast.LENGTH_SHORT);
                if(R1.isChecked()== true){
                    Intent i2 = new Intent(activity_2.this,facil1.class);
                    startActivity(i2);
                }
                else {
                    if(R2.isChecked()== true){
                        Intent i2 = new Intent(activity_2.this,Normal1.class);
                        startActivity(i2);
                    }
                    else {
                        if(R3.isChecked()== true){
                            Intent i2 = new Intent(activity_2.this,Dificil1.class);
                            startActivity(i2);
                        }
                        else t.show();
                    }
                }




            }

        });




    }
}
