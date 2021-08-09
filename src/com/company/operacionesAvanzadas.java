package com.company;

public class operacionesAvanzadas {

    private double resultado;

   //Uso del constructor
    public operacionesAvanzadas(){

    }

    public operacionesAvanzadas(double resultado){
        this.resultado = resultado;
    }

    public double raizCuadrada(){
        double resultadoraizcuadrada = Math.sqrt(this.resultado);
        return resultadoraizcuadrada;
    }

    public double seno(){
        double radianes = Math.toRadians(this.resultado);
        double seno = Math.sin(radianes);
        return seno;
    }

    public double coseno() {
        double radianes = Math.toRadians(this.resultado);
        double coseno = Math.cos(radianes);
        return coseno;
    }

    public double tangente(){
        double radianes = Math.toRadians(this.resultado);
        double tangente = Math.tan(radianes);
        return tangente;
    }

}
