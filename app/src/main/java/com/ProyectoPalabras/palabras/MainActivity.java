package com.ProyectoPalabras.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button,button6,OPjuga ;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.Nombre);
        button6 = (Button) findViewById(R.id.button6);
        OPjuga = (Button) findViewById(R.id.OP_jugador);
        button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick( View view){
            enviar();

        }


    });
        OPjuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Opciones_de_jugador.class);
                startActivity(i);
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

        if(editText.getText().toString().toUpperCase().equals("")){
            Toast.makeText(this, "Debe introducir Un Nombre", Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(MainActivity.this,activity_2.class);
            i.putExtra("valor",editText.getText().toString());
            startActivity(i);
        }
    }
    public void Ingresar_Jugador(){
        Conexion Jugador = new Conexion(this, "Jugadores", null, 1);

        SQLiteDatabase BD = Jugador.getReadableDatabase();
        try {
            String JUG = this.editText.getText().toString();
            ContentValues Ingreso = new ContentValues();
            Ingreso.put("Nombre_Jugador", JUG);
            BD.insert("Jugadores", null, Ingreso);
        }
        catch (Exception e){
            Toast t = Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT);
        }
        finally {
            BD.close();
        }

    }

}
