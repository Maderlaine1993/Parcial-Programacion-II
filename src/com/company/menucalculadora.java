package com.company;

public class menucalculadora {

    int opcion;
    boolean salir = false;

    public menucalculadora(){
        opcion = 0;
    }

    public void menucalculadora() {

        visualizacion ojos = new visualizacion();
        salir = false;

        do {

            System.out.println("--------- Menu Principal---------");
            System.out.println("      1.- Menu Basico            ");
            System.out.println("      2.- Menu Avanzado          ");
            System.out.println("      3.- Salir                  ");
            System.out.print(" Ingrese la opcion a escoger :     ");

            int opcion = ojos.ver();

            if (opcion == 1) {
                menuBasico i = new menuBasico();
                i.menuBasico();

            } else if (opcion == 2) {
                menuAvanzado j = new menuAvanzado();
                j.menuAvanzado();

            } else if (opcion == 3) {
                System.out.println("Bye");
                salir = true;
            }

            else{
                    mensajeError();
                }

        }while (!salir) ;
    }

    public void mensajeError(){
        System.out.println(" Opción invalida ");
        System.out.println(" Ingrese una opción valida ");
    }
}
