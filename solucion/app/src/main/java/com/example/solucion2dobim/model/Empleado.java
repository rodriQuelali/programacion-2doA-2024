package com.example.solucion2dobim.model;

public class Empleado {
    private String nombre;
    private int anos;
    private int sueldo;

    public Empleado(String nombre, int anos, int sueldo) {
        this.nombre = nombre;
        this.anos = anos;
        this.sueldo = sueldo;
    }

    public int calularSueldo(){
        if(this.sueldo >= 2000 || this.sueldo <= 7000){
            if(this.anos > 11){
                int sueldoTotal = (int) (this.sueldo*0.10);
                return  sueldoTotal;
            } else if (this.anos > 6) {
                int sueldoTotal = (int) (this.sueldo*0.10);
                return  sueldoTotal;
            }else {
                int sueldoTotal = (int) (this.sueldo*0.10);
                return  sueldoTotal;
            }
        }
        return 0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
