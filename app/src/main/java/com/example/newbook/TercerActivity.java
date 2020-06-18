package com.example.newbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TercerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
    }
    //Metodo par el boton Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this, SegundaActivity.class);
        startActivity(anterior);
    }
}