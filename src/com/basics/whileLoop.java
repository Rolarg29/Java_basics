package com.basics;

public class whileLoop { // estructura ded control indeterminada

    public static void main(String[] args) {

        boolean check = true;

        int count = 0;
        while(count < 10){
            count++; //condición

            if(count == 6)
                //continue;// salta el valor y continua a la siguiente iteración
                break; /*
                rompe el bucle y sale del while, se suele usar cuando se busca un valor específico,
                se encuentra y ya no tiene caso continuar iterando
                */


            System.out.println("Hola mundo " + count);

        }
        System.out.println("<<<Fin del bucle>>>");

    }

}
