package com.ProyectoPalabras.palabras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexion extends SQLiteOpenHelper {

    public Conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase Mibasededatos) {

        Mibasededatos.execSQL("create table Jugadores( Jugador primary key)");

        Mibasededatos.execSQL("create table Adivinanzas_FACIL(Palabra text primary key, Adivinanza text)");
        Mibasededatos.execSQL("insert into Adivinanzas_FACIL(Palabra,Adivinanza) values ('HIPOPOTAMO','Tengo hipo al decir mi nombre, ¿quien soy?')");

        Mibasededatos.execSQL("create table Adivinanzas_NORMAL(Palabra text primary key, Adivinanza text)");
        Mibasededatos.execSQL("insert into Adivinanzas_NORMAL(Palabra,Adivinanza) values ('TOMATE','¿Quieres té? ¡Pues toma té! ¿Sabes ya qué fruto es?')");

        Mibasededatos.execSQL("create table Adivinanzas_DIFICIL(Plabra text primary key, Adivinanza text)");
        Mibasededatos.execSQL("insert into Adivinanzas_DIFICIL(Palabra,Adivinanza) values ('YO','Mi padre tiene cuatro hijos, MARÍA, RAQUEL, MANUEL, ¿quién es el cuarto?')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

