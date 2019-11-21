package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
        this.Asig_Adi();

    }
    public void Asig_Adi(){
        Conexion tabla_Facil = new Conexion(this, "facil", null,1);
        SQLiteDatabase BD = tabla_Facil.getWritableDatabase();
        Cursor F = BD.rawQuery("select Adivinanza from Adivinanzas_FACIL ", null);
        this.T.setText(F.getString(0));
        BD.close();
        //Problemas para ejecutar el activy, probablemente sea la visualizacion del texview
    }
}
