package com.example.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caja1, caja2;
    private TextView tvResultado;
    private Button btnOperar;
    private Spinner spOperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarR();
        llenarSpiner();
        eventoBoton();
    }
    //iniciando con la clase R.
    public void cargarR(){
        caja1 = (EditText) findViewById(R.id.txt1);
        caja2 = (EditText) findViewById(R.id.txt2);
        tvResultado = (TextView) findViewById(R.id.tvRes);
        btnOperar = (Button) findViewById(R.id.btnOp);
        spOperar = (Spinner) findViewById(R.id.sp1);
    }
    //eventos de Botones
    public void eventoBoton(){
        btnOperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seleccion = spOperar.getSelectedItem().toString();

                if(seleccion.equals("suma")){
                    String total = String.valueOf(Integer.parseInt(caja1.getText().toString()) +Integer.parseInt(caja2.getText().toString()));
                    tvResultado.setText(total);
                    //realizar la operacion
                } else if (seleccion.equals("resta")) {
                    //realizar la operacion
                } else if (seleccion.equals("multiplicar")) {
                    //realizar la operacion
                } else if (seleccion.equals("dividir")) {
                    //realizar la operacion
                }

            }
        });
    }
    //spinner
    public void llenarSpiner(){
        String [] operacionres = {"suma", "resta", "multiplicar","dividir"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operacionres);
        spOperar.setAdapter(arrayAdapter);
    }

}