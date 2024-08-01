package com.example.mipasoskotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular: Button
    lateinit var txtPrecio: EditText
    lateinit var tvResul: TextView

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


    }
    fun cargarR (){
        btnCalcular = findViewById(R.id.btnCalcularIVA)
        txtPrecio = findViewById(R.id.txtProducto)
        tvResul = findViewById(R.id.tvResultado)
    }

    fun estadoOnclick(){
        btnCalcular.setOnClickListener(){
            Toast.makeText(this, "Hola mundo",Toast.LENGTH_SHORT).show()
            val text:String = txtPrecio.text.toString()
            val datosRe : Double = calIVA(txtPrecio.text.toString().toDouble())
            tvResul.text = datosRe.toString()

        }
    }

    //funcion para calcular IVA
    fun calIVA(costo:Double): Double{
        val total:Double =costo * 0.003
        return total
    }

}