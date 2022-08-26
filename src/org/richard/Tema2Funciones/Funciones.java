package org.richard.Tema2Funciones;

public class Funciones {
    public static void main(String[] args) {

        double price = 100.2D;
        System.out.println(" price with IVA:" + getPriceWithIVA(price) );

    }

    public static double getPriceWithIVA(double price){
        double iva = 1.2;
        return price*iva;
    }
}
