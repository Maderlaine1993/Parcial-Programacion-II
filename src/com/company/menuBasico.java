package com.company;

public class menuBasico {

    int opcion;
    boolean salir = false;

    public menuBasico() {
        opcion = 0;
    }

    public void menuBasico() {

        visualizacion ojos = new visualizacion();
        salir = false;

        do {

            System.out.println("--------- Calculos Basicos---------");
            System.out.println("      1.- Suma                     ");
            System.out.println("      2.- Resta                    ");
            System.out.println("      3.- Multiplicacion           ");
            System.out.println("      4.- Division                 ");
            System.out.println("      5.- Salir                    ");
            System.out.print(" Ingrese la opcion a escoger :       ");

            int opcion = ojos.ver();

            if (opcion == 1) {

                ingresoDatos();
                double numero1operacionesBasicas = ojos.ver();
                ingresoDatosDos();
                double numero2operacionesBasicas = ojos.ver();
                operacionesBasicas suma = new operacionesBasicas(numero1operacionesBasicas,numero2operacionesBasicas);
                System.out.println( "El resultado de la suma es: " + suma.sumar());

            } else if (opcion == 2) {
                ingresoDatos();
                double numero1operacionesBasicas = ojos.ver();
                ingresoDatosDos();
                double numero2operacionesBasicas = ojos.ver();
                operacionesBasicas resta = new operacionesBasicas(numero1operacionesBasicas,numero2operacionesBasicas);
                System.out.println( "El resultado de la resta es: " + resta.restar());

            } else if (opcion == 3) {
                ingresoDatos();
                double numero1operacionesBasicas = ojos.ver();
                ingresoDatosDos();
                double numero2operacionesBasicas = ojos.ver();
                operacionesBasicas multiplicar = new operacionesBasicas(numero1operacionesBasicas,numero2operacionesBasicas);
                System.out.println( "El resultado de la multiplicación es: " + multiplicar.multiplicar());

            } else if (opcion == 4) {
                ingresoDatos();
                double numero1operacionesBasicas = ojos.ver();
                ingresoDatosDos();
                double numero2operacionesBasicas = ojos.ver();
                operacionesBasicas division = new operacionesBasicas(numero1operacionesBasicas,numero2operacionesBasicas);
                System.out.println( "El resultado de la division es: " + division.dividir());

            } else if (opcion == 5) {
                System.out.println("Bye");
                salir = true;
            } else {
                menucalculadora dos = new menucalculadora();
                dos.mensajeError();
            }

        } while (!salir);
    }

    public void ingresoDatos(){
        System.out.print( " Ingrese el primer digito : ");
    }

    public void ingresoDatosDos(){
        System.out.print(" Ingrese el segundo digito : ");
    }
}
