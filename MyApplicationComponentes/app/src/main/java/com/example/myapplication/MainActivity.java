package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button tnh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting
        //parsing

    }

    //realizar la codificacion para el llamado a otra actividad.
    //Objeto llamado Intent.

    public void lanzar(View view){
        Intent intent = new Intent(this, registro.class);
        startActivity(intent);
    }

}