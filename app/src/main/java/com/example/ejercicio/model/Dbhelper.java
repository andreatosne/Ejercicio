package com.example.ejercicio.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
// esta clase es pala la conexion a la Base de datos

public class Dbhelper  extends SQLiteOpenHelper {
    //recibir valores nullos
    public Dbhelper(@Nullable Context context) {
        super(context,Constante.NOM_DB,null,Constante.VERSION_BD);
;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Ejecuta la sentencia decreacion de la base de datos
        sqLiteDatabase.execSQL(Constante. SentenciaTabla);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
