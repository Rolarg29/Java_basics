package com.basics;

public class StringMain {

    public static void main(String[] args) {

        String mensaje = "Hello World";
        System.out.println("Texto original: " + mensaje);

        //longitud del string
        int longitud = mensaje.length();
        System.out.println("Longitud: " + longitud);

        //convierte a Mayusculas
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println("En mayusculas: " + mensajeMAY);

        //elimina espacios innecesarios
        String nombre = "  Rolando  ";
        System.out.println(nombre);
        System.out.println(nombre.trim());

        //comparar textos
        String mensaje2 = "HELLO WORLD";
        if (mensajeMAY.equals(mensaje2)) {
            System.out.println("Verdadero");
        }


        if (mensaje.equalsIgnoreCase(mensaje2)) {//no es case sensitive
            System.out.println("también verdadero");
        }

    }
}
