package com.example.poo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.poo1.clases.operacion;


public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    TextView txtResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);

        txtResul = (TextView) findViewById(R.id.textResul);
    }
    public void sumar(View view){
        int a,b;
        a = Integer.parseInt(txt1.getText().toString());
        b = Integer.parseInt(txt2.getText().toString());
        operacion op1 = new operacion();
        txtResul.setText(String.valueOf(op1.suma(a, b)));
    }
}