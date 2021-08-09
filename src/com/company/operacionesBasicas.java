package com.company;

public class operacionesBasicas {
    //Atributos
    private double numero1;
    private double numero2;

    public operacionesBasicas() {

    }

    //Hacemos uso del constructor de la clase Operaciones Basicas
    public operacionesBasicas(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    // Creacion de metodos a utilizar
    public double sumar()
    {
        double resultadosumar = this.numero1 + this.numero2;
        return resultadosumar;
    }

    public double restar()
    {
        double resultadorestar = this.numero1 - this.numero2;
        return resultadorestar;
    }

    public double multiplicar()
    {
        double resultadomultiplicar = this.numero1 * this.numero2;
        return resultadomultiplicar;
    }

    public double dividir()
    {
        double resultadodividir = this.numero1 / this.numero2;
        return resultadodividir;
    }

    public double potencias()
    {
        double resultadopotencias = (int)Math.pow(this.numero1, this.numero2);
        return resultadopotencias;
    }

}
