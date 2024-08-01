package com.example.solucion2dobim.adapterEmpleado;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solucion2dobim.R;
import com.example.solucion2dobim.model.Empleado;

import java.util.ArrayList;

public class AdapterEmpleado extends RecyclerView.Adapter<AdapterEmpleado.ListaEmpleadoViewHolder> {
    ArrayList<Empleado> listaEmpleado;

    public AdapterEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    @NonNull
    @Override
    public AdapterEmpleado.ListaEmpleadoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.empleadolista,null,false);
        return new ListaEmpleadoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterEmpleado.ListaEmpleadoViewHolder holder, int position) {
        holder.tvN.setText(listaEmpleado.get(position).getNombre());
        holder.tvS.setText(String.valueOf(listaEmpleado.get(position).getSueldo()));
        holder.tvIncr.setText(String.valueOf(listaEmpleado.get(position).calularSueldo()));
        holder.tvTotal.setText(String.valueOf(listaEmpleado.get(position).getSueldo()+listaEmpleado.get(position).calularSueldo()));
    }

    @Override
    public int getItemCount() {
        return listaEmpleado.size();
    }

    public class ListaEmpleadoViewHolder extends RecyclerView.ViewHolder {
        TextView tvN,tvTotal,tvS,tvIncr;
        public ListaEmpleadoViewHolder(@NonNull View itemView) {
            super(itemView);
            tvN = itemView.findViewById(R.id.tvNo);
            tvS = itemView.findViewById(R.id.tvSal);
            tvIncr = itemView.findViewById(R.id.tvInc);
            tvTotal = itemView.findViewById(R.id.tvTotal);
        }
    }
}
