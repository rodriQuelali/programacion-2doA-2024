package com.example.poo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.poo1.clases.operacion;


public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    TextView txtResul;
    Button btnSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);

        txtResul = (TextView) findViewById(R.id.textResul);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        ///llamando al metodo omclick bajo codigo
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });

    }
    public void sumar(){
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