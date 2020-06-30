package com.example.newbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }
    //Metodo para el boton Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    //Metodo para el boton Inicio de Sesion
    public void Inicio(View view){
        Intent inicio = new Intent(this, TercerActivity.class);
        startActivity(inicio);
    }
    //Metodo para en boton Registarse
    public void Registrarse(View view){
        Intent registrarse =new Intent(this, CuartaActivity.class);
        startActivity(registrarse);
    }
}