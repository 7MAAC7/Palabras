package com.ProyectoPalabras.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        String a = "Mi padre tiene cuatro hijos, MARÍA, RAQUEL, MANUEL, ¿quién es el cuarto?";

        TF.setText(a);
        this.BF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                String R = "YO";
                if(EF.getText().toString().toUpperCase().equals(R)){
                    Intent i = new Intent(Dificil1.this,Logrado.class);
                    startActivity(i);
                }else{
                    Toast t = Toast.makeText(Dificil1.this, "Intente de Nuevo", Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });
    }
    public void Asignar_adivinanza(){
        Conexion Tabla_dificil = new Conexion(this, "Dificil", null,1);
        SQLiteDatabase BD = Tabla_dificil.getWritableDatabase();
        try {
            Cursor F = BD.rawQuery("select Adivinanza from Adivinanzas_DIFICIL ", null);

        this.TF.setText(F.getString(0));
        }
        catch (Exception e){
            Toast t = Toast.makeText(Dificil1.this, "ERROR", Toast.LENGTH_SHORT);
        }
        finally {
            BD.close();
        }

        //Problemas para ejecutar el activy, probablemente sea la visualizacion del texview
    }
}
