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
        double a,b;
        a = Double.parseDouble(txt1.getText().toString());
        b = Double.parseDouble(txt2.getText().toString());
        txtResul.setText(String.valueOf(operacion.suma(a, b)));
    }

    public void restar(View view){
        double a,b;
        a = Double.parseDouble(txt1.getText().toString());
        b = Double.parseDouble(txt2.getText().toString());
        txtResul.setText(String.valueOf(operacion.resta(a, b)));
    }

    public void mul(View view){
        double a,b;
        a = Double.parseDouble(txt1.getText().toString());
        b = Double.parseDouble(txt2.getText().toString());
        txtResul.setText(String.valueOf(operacion.multiplicar(a, b)));
    }
    public void div(View view){
        double a,b;
        a = Double.parseDouble(txt1.getText().toString());
        b = Double.parseDouble(txt2.getText().toString());
        if(b != 0){
            txtResul.setText(String.valueOf(operacion.division(a, b)));
        }else {
            txtResul.setText("no se puede hacer la division");
        }

    }
}