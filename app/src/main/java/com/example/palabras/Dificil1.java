package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
        this.Asignar_adivinanza();
    }
    public void Asignar_adivinanza(){
        Conexion Tabla_dificil = new Conexion(this, "Dificil", null,1);
        SQLiteDatabase BD = Tabla_dificil.getWritableDatabase();
        Cursor F = BD.rawQuery("select Adivinanza from Adivinanzas_DIFICIL ", null);
        this.TF.setText(F.getString(0));
        BD.close();
        //Problemas para ejecutar el activy, probablemente sea la visualizacion del texview
    }
}
