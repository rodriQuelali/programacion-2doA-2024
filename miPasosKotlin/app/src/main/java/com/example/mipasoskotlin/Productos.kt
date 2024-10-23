package com.example.mipasoskotlin

import android.content.ContentValues
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mipasoskotlin.db.AdminSQLiteOpenHelper
import com.example.mipasoskotlin.models.Productos

class Productos : AppCompatActivity() {
    lateinit var btnRegistroPro:Button
    lateinit var txtNom:EditText
    lateinit var txtPrecio:EditText
    lateinit var txtCodigo:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarR()

        estadoBoton()
    }

    fun cargarR(){
        btnRegistroPro=findViewById(R.id.btnRegistroProducto)
        txtNom = findViewById(R.id.txtNombre)
        txtPrecio = findViewById(R.id.txtPrecio)
        txtCodigo = findViewById(R.id.txtCodigoProducto)
    }

    fun estadoBoton(){
        btnRegistroPro.setOnClickListener{

            val adminsql = AdminSQLiteOpenHelper(this,"administracion",null,1)
            val db = adminsql.writableDatabase
            val registro = ContentValues()


            //realizando la intancia del objeto.
            val objeto = Productos(txtNom.text.toString(), txtPrecio.text.toString().toDouble(),1)

            registro.put("id_productos", txtCodigo.text.toString())
            registro.put("nombre", objeto.getNombre())
            registro.put("precio", objeto.getPrecio())
            db.insert("productos", null, registro)
            db.close()
            txtCodigo.setText("")
            txtNom.setText("")
            txtPrecio.setText("")
            Toast.makeText(this, "Se cargaron los datos del producto", Toast.LENGTH_SHORT).show()

        }
    }
}