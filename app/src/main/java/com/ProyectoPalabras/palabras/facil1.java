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
        String a = "Tengo hipo al decir mi nombre, ¿quien soy?";

        T.setText(a);
        this.B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                String R = "HIPOPOTAMO";
                if(E.getText().toString().toUpperCase().equals(R)){
                    Intent i = new Intent(facil1.this,Logrado.class);
                    startActivity(i);
                }else{
                    Toast t = Toast.makeText(facil1.this, "Intente de Nuevo", Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });
    }
    public void Asig_Adi(){
        Conexion tabla_Facil = new Conexion(this, "facil", null, 1);
        SQLiteDatabase BD = tabla_Facil.getWritableDatabase();
       try {

           Cursor F = BD.rawQuery("select Adivinanza from Adivinanzas_FACIL ", null);
           this.T.setText(F.getString(0));
       }
       catch (Exception e){
           Toast t = Toast.makeText(facil1.this, "ERROR", Toast.LENGTH_SHORT);

       }
       finally {
           BD.close();
       }

        //Problemas para ejecutar el activy, probablemente sea la visualizacion del texview
    }
}
