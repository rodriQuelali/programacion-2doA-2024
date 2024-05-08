package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    TextView tvre;
    Button tbope;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        tvre = (EditText) findViewById(R.id.tvres);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);

        tbope = (Button) findViewById(R.id.btnres);
        //metodo onclick
        tbope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String val1 = txt1.getText().toString();
                String val2 = txt2.getText().toString();
                int op1 = Integer.parseInt(val1);
                int op2 = Integer.parseInt(val2);*/
                if(r1.isChecked() == true){
                    /*int res = op1 +op2;
                    String strinres= String.valueOf(res);
                    tvre.setText(strinres);*/
                    tvre.setText(String.valueOf(Integer.parseInt(txt1.getText().toString())+Integer.parseInt(txt2.getText().toString())));
                }
            }
        });
    }
}