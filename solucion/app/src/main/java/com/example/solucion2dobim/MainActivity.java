package com.example.solucion2dobim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.solucion2dobim.adapterEmpleado.AdapterEmpleado;
import com.example.solucion2dobim.model.Empleado;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txtN, txtA, txtS;
    private RecyclerView recyclerViewEmpleado;
    private Button btnCal;

    AdapterEmpleado listaAdapterCliente;

    ArrayList<Empleado> listaEmpleadoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarR();
        vargarRecy();
        estadoButon();
    }

    public  void cargarR(){
        txtN = (EditText) findViewById(R.id.txtNo);
        txtA = (EditText) findViewById(R.id.txtAno);
        txtS = (EditText) findViewById(R.id.txtSal);
        recyclerViewEmpleado = (RecyclerView) findViewById(R.id.listaEmpleado);
        btnCal = (Button) findViewById(R.id.button);
    }

    public void vargarRecy(){
        recyclerViewEmpleado.setLayoutManager(new LinearLayoutManager(this));
        listaEmpleadoView = new ArrayList<Empleado>();
        listaEmpleadoView.add(new Empleado("MAMANI", 2, 2500));
        listaAdapterCliente = new AdapterEmpleado(listaEmpleadoView);
        recyclerViewEmpleado.setAdapter(listaAdapterCliente);
    }

    public void estadoButon(){
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtN.getText().toString();
                int ano = Integer.parseInt(txtA.getText().toString());
                int sueldo = Integer.parseInt(txtS.getText().toString());
                listaEmpleadoView.add(new Empleado(nombre, ano, sueldo));
                recyclerViewEmpleado.setAdapter(listaAdapterCliente);
            }
        });
    }
}