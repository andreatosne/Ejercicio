package com.example.ejercicio.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;

public class ManagerDb {

    Dbhelper dbhelper;
    SQLiteDatabase db;

    public ManagerDb(Context context) { //cponstructor
        dbhelper = new Dbhelper(context);//llamo a la conexión


    }

    //void no retorna nada
    public void openDbWr() {

        db = dbhelper.getWritableDatabase();


    }

    public void openDbRd() {//metodo para abrir la base de datos

        db = dbhelper.getReadableDatabase();
    }


    public void closeDb() { //metodo para cerrar la conexuin de la base de datos

        if (db != null) {
            db.close();
        }


    }

    public long insertarData(Persona persona) {

        openDbWr();
        ContentValues valores = new ContentValues();
        valores.put("Cod",persona.getCod());
        valores.put("Nombre", persona.getNombre());
        valores.put("Apellido", persona.getApellido());
        valores.put("telefono", persona.getTelefono());
        long resultado = db.insert("Persona", null, valores);

return resultado;
    }
}