package com.example.newbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CuartaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta);
    }
    //Metodo para el boton Atras
    public void Atras(View view){
        Intent atras = new Intent(this, SegundaActivity.class);
        startActivity(atras);
    }
}