package org.richard.Tema3Bucles;

public class BuclesEjecicio3 {
    public static void main(String[] args) {
        String[] nombres = {"", "Java", "", "Bucles"};
        String message = "";
        for (String nombre: nombres){
            message = message.concat(nombre+" ");
        }

        System.out.println("message = " + message);
    }
}
