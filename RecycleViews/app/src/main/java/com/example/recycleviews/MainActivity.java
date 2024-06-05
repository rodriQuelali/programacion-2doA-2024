package com.example.recycleviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.recycleviews.adapter.ListaAdapterCliente;
import com.example.recycleviews.model.Cliente;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listaClientes;
    private ArrayList<Cliente> clientes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarR();
        cargarRecyrcleyView();
    }
    //clase R
    public void cargarR(){
        listaClientes = (RecyclerView) findViewById(R.id.recListaPersona);
    }
    //recyrcleyView
    public void cargarRecyrcleyView(){
        listaClientes.setLayoutManager(new LinearLayoutManager(this));
        clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("MAMANI", 1025666));
        clientes.add(new Cliente("BRITO", 10256345));
        ListaAdapterCliente listaAdapterCliente = new ListaAdapterCliente(clientes);
        listaClientes.setAdapter(listaAdapterCliente);

    }
}