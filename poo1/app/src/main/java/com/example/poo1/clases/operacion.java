package com.example.poo1.clases;

public class operacion {
    private int num1;
    private int num2;

    //constructor
    /*public operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }*/


    //get and set
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //metodos

    public int suma(int nun1, int num2){
        int s = num1 + num2;
        return s;
    }

    public Double suma(Double nun1, Double num2){
        Double s = num1 + num2;
        return s;
    }


}

//Operacion operacion = new Operacion(2,4);
//operacion.suma();

