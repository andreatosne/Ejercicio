package com.example.ejercicio.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Persona {
    private int cod;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {//constructor vacio


    }

    public Persona(int cod, String nombre, String apellido, String telefono) {
        this.cod = cod;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;


    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
