package com.example.newbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuintaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityquinta);
    }

        //metodo para el boton inicio (flecha)

        public void Libros(View view ){
            Intent libros = new Intent (this, QuintaActivity.class);
            startActivity(libros);
        }

        //metodo para el boton quiz (lapiz)

        public void Quiz(View view){
            Intent quiz = new Intent(this, Quiz.class);
            startActivity(quiz);
        }
}
