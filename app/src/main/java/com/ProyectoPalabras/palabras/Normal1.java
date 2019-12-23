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
        String a = "¿Quieres té? ¡Pues toma té! ¿Sabes ya qué fruto es?";

        TN.setText(a);
        this.BN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                String R = "TOMATE";
                if(EN.getText().toString().toUpperCase().equals(R)){
                    Intent i = new Intent(Normal1.this,Logrado.class);
                    startActivity(i);
                }else{
                    Toast t = Toast.makeText(Normal1.this, "Intente de Nuevo", Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });

    }
    public void Asignar_adivinanza(){
        Conexion Tabla_normal = new Conexion(this, "Normal", null,1);
        SQLiteDatabase BD = Tabla_normal.getWritableDatabase();
        try {
            Cursor N = BD.rawQuery("select Adivinanza from Adivinanzas_NORMAL ", null);
            this.TN.setText(N.getString(0));
        }
        catch (Exception e){
            Toast t = Toast.makeText(Normal1.this, "ERROR", Toast.LENGTH_SHORT);
        }
        finally {
            BD.close();
        }

        //Problemas para ejecutar el activy, probablemente sea la visualizacion del texview
    }
}
