package com.example.ejercicio.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercicio.R;
import com.example.ejercicio.model.Dbhelper;
import com.example.ejercicio.model.ManagerDb;
import com.example.ejercicio.model.Persona;

public class MainActivity extends AppCompatActivity {

EditText edtcodigo;
    EditText edtNom;
    EditText edtApe;
    EditText edetTel;

   Button btninsertar;


    SQLiteDatabase db;
    ManagerDb managerDb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtcodigo = findViewById(R.id.edtcodigo);
        edtNom = findViewById(R.id.edtNombre);
        edtApe = findViewById(R.id.edtApellido);
        edetTel = findViewById(R.id.edtTelefono);
btninsertar = findViewById(R.id.btnInsertar);
        btninsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                managerDb=new ManagerDb(MainActivity.this);

                Toast.makeText( MainActivity.this, "Bse de Datos Creada", Toast.LENGTH_SHORT).show();

                int codigo = Integer.parseInt(edtcodigo.getText().toString());
                String nombre= edtNom.getText().toString();
                String apellido= edtApe.getText().toString();
                String telefono= edetTel.getText().toString();


                Persona persona =new Persona(codigo,nombre,apellido,telefono);

               long result=  managerDb.insertarData(persona);//llamo al metodo insertar datos

              if(result>0 ){
              Toast.makeText(MainActivity.this, "datos insertados", Toast.LENGTH_SHORT).show();


              }else {
                  Toast.makeText(MainActivity.this, "datos  no insertados"+result, Toast.LENGTH_SHORT).show();
             }




            }
        });













    }
}