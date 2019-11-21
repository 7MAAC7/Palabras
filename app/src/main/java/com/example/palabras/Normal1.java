package com.example.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
        this.Asignar_adivinanza();
    }
    public void Asignar_adivinanza(){
        Conexion Tabla_normal = new Conexion(this, "Normal", null,1);
        SQLiteDatabase BD = Tabla_normal.getWritableDatabase();
        Cursor N = BD.rawQuery("select Adivinanza from Adivinanzas_NORMAL ", null);
        this.TN.setText(N.getString(0));
        BD.close();
        //Problemas para ejecutar el activy, probablemente sea la visualizacion del texview
    }
}
