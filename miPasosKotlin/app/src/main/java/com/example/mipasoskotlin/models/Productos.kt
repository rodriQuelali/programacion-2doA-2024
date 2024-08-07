package com.example.mipasoskotlin.models

class Productos constructor(nombre:String, precio:Double) {

    var nombre:String = nombre
    var precio:Double = precio

    fun calIVA(iva:Double): Double{
        val total:Double =precio * iva
        return total
    }
}