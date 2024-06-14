package com.example.recycleviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvN, tvNit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cargarR();
        Bundle bundle =getIntent().getExtras();
        tvN.setText(bundle.getString("nombre"));
    }
    public void cargarR(){
        tvN = (TextView) findViewById(R.id.tvN);
        tvNit = (TextView) findViewById(R.id.tvNit);
    }
}