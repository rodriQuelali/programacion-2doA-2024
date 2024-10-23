package com.example.mipasoskotlin.models

class Productos constructor(nombre:String, precio:Double, idProducto: Int) {

    private var nombre:String = nombre
    private var precio:Double = precio
    private var idProducto:Int = idProducto

    //get
    fun getNombre():String{
        return nombre
    }

    fun getPrecio():Double{
        return precio
    }

    fun getIdProducto():Int{
        return idProducto
    }

    //set

    fun setNombre(nombre: String){
        this.nombre = nombre
    }

    fun setPrecio(precio: Double){
        this.precio = precio
    }

    fun setIdProducto(idProducto: Int){
        this.idProducto = idProducto
    }

    fun calIVA(iva:Double): Double{
        val total:Double =precio * iva
        return total
    }
}