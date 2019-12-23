package com.ProyectoPalabras.palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Opciones_de_jugador extends AppCompatActivity {
    Button B, V;
    EditText E;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_de_jugador);
        B = (Button) findViewById(R.id.Elim_Jugador);
        E = (EditText) findViewById(R.id.Edit_jugador);
        V = (Button) findViewById(R.id.VOL);
        this.V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Opciones_de_jugador.this,MainActivity.class);
                startActivity(i);
            }
        });
        this.B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Eliminar_Jugador();
            }
        });
    }
    public void Eliminar_Jugador(){
        String Jug = this.E.getText().toString();
        Conexion miobjeto = new Conexion(this, "Eliminar Jugador", null,1);
        SQLiteDatabase BD = miobjeto.getWritableDatabase();
        try{
            if(!Jug.isEmpty()){
                int cant = BD.delete("Jugadores","Jugador ="+ Jug, null);
                this.Limpiar();
                if(cant == 1){
                    Toast.makeText(this, "Jugador eliminado", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "El Jugador no existe", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(this, "Debe introducir Un Jugador a eliminar", Toast.LENGTH_SHORT).show();
            }
        }
        catch (SQLException e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        finally {
            BD.close();
        }
    }
    private void Limpiar(){
        this.E.setText("");
    }
}
