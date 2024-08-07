package com.example.mipasoskotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mipasoskotlin.models.Productos

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular: Button
    lateinit var txtPrecio: EditText
    lateinit var tvResul: TextView
    lateinit var spLista:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //codigo
        cargarR()
        estadoOnclick()

        //cargar listad e datos en spinner
        val listaPaises = arrayOf("USA", "BOL", "ESP")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaPaises)
        spLista.adapter = adaptador1


    }
    fun cargarR (){
        btnCalcular = findViewById(R.id.btnCalcularIVA)
        txtPrecio = findViewById(R.id.txtProducto)
        tvResul = findViewById(R.id.tvResultado)
        spLista = findViewById(R.id.spPaises)
    }

    fun estadoOnclick(){
        btnCalcular.setOnClickListener(){

            val laptop = Productos("laptop", txtPrecio.text.toString().toDouble())
            //val datosRe : Double = laptop.calIVA()

            when(spLista.selectedItem.toString()){
                "USA"-> tvResul.text = laptop.calIVA(0.03).toString()
                "BOL"-> tvResul.text = laptop.calIVA(0.13).toString()
                "ESP"-> tvResul.text = laptop.calIVA(0.05).toString()
            }

        }
    }



}