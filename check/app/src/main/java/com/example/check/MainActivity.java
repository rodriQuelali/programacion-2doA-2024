package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declarar variables
    EditText txt1,txt2;
    TextView tvR;
    Button btnOpe;
    CheckBox ch1,ch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamarClaseR();
        eventosButon();
    }
    public void llamarClaseR(){
        txt1 = (EditText) findViewById(R.id.editTextText);
        txt2 = (EditText) findViewById(R.id.editTextText2);
        tvR = (TextView) findViewById(R.id.textView3);
        btnOpe = (Button) findViewById(R.id.button);
        ch1 = (CheckBox) findViewById(R.id.checkBox);
        ch2 = (CheckBox) findViewById(R.id.checkBox2);
    }
    public void eventosButon(){
        btnOpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1 = Integer.parseInt(txt1.getText().toString());
                int nu2 = Integer.parseInt(txt2.getText().toString());
                String resultado = "";
                if(ch1.isChecked() == true){
                    int suma = nu1 + nu2;
                    resultado += "suma: " + suma;
                }
                if(ch2.isChecked()==true){
                    int resta = nu1 - nu2;
                    resultado += "resta: " + resta;
                }
                tvR.setText(resultado);
            }
        });
    }
}