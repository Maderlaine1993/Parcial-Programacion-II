package com.company;

public class menuAvanzado {

    int opcion;
    boolean salir = false;

    public menuAvanzado() {
        opcion = 0;
    }

    public void menuAvanzado() {

        visualizacion ojos = new visualizacion();
        salir = false;

        do {

            System.out.println("-------- Calculos Avanzados--------");
            System.out.println("      1.- Raiz Cuadrada            ");
            System.out.println("      2.- Potencias                ");
            System.out.println("      3.- Seno                     ");
            System.out.println("      4.- Coseno                   ");
            System.out.println("      5.- Tangente                 ");
            System.out.println("      6.- Salir                    ");
            System.out.print(" Ingrese la opcion a escoger :       ");

            int opcion = ojos.ver();

            if (opcion == 1) {

                ingresoDatos();
                double resultadooperacionesAvanzadas = ojos.ver();
                ingresoDatosDos();
                double resultado2operacionesAvanzadas = ojos.ver();
                operacionesAvanzadas raiz = new operacionesAvanzadas(resultadooperacionesAvanzadas);
                operacionesAvanzadas raiz2 = new operacionesAvanzadas(resultado2operacionesAvanzadas);
                System.out.println( "La raiz cuadrada del primer digito es: " + raiz.raizCuadrada());
                System.out.println( "La raiz cuadrada del segundo digito es: " + raiz2.raizCuadrada());

            } else if (opcion == 2) {
                ingresoDatos();
                double numero1operacionesBasicas = ojos.ver();
                ingresoDatosDos();
                double numero2operacionesBasicas = ojos.ver();
                operacionesBasicas potencia = new operacionesBasicas(numero1operacionesBasicas,numero2operacionesBasicas);
                System.out.println( "El resultado de la Potencia es: " + potencia.potencias());

            } else if (opcion == 3) {
                ingresoDatos();
                double resultadooperacionesAvanzadas = ojos.ver();
                ingresoDatosDos();
                double resultado2operacionesAvanzadas = ojos.ver();
                operacionesAvanzadas seno = new operacionesAvanzadas(resultadooperacionesAvanzadas);
                operacionesAvanzadas seno2 = new operacionesAvanzadas(resultado2operacionesAvanzadas);
                System.out.println( " El seno del primer digito es: " + seno.seno());
                System.out.println( " El seno del segundo digito es: " + seno2.seno());

            } else if (opcion == 4) {
                ingresoDatos();
                double resultadooperacionesAvanzadas = ojos.ver();
                ingresoDatosDos();
                double resultado2operacionesAvanzadas = ojos.ver();
                operacionesAvanzadas coseno = new operacionesAvanzadas(resultadooperacionesAvanzadas);
                operacionesAvanzadas coseno2 = new operacionesAvanzadas(resultado2operacionesAvanzadas);
                System.out.println( " El coseno del primer digito es: " + coseno.coseno());
                System.out.println( " El coseno del segundo digito es: " + coseno2.coseno());

            } else if (opcion == 5) {
                ingresoDatos();
                double resultadooperacionesAvanzadas = ojos.ver();
                ingresoDatosDos();
                double resultado2operacionesAvanzadas = ojos.ver();
                operacionesAvanzadas tangente = new operacionesAvanzadas(resultadooperacionesAvanzadas);
                operacionesAvanzadas tangente2 = new operacionesAvanzadas(resultado2operacionesAvanzadas);
                System.out.println( " La tangente del primer digito es: " + tangente.tangente());
                System.out.println( " La tangente del segundo digito es: " + tangente2.tangente());

            } else if (opcion == 6) {
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
