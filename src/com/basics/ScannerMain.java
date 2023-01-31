package com.basics;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("Tu edad es: " + edad + " años");


        System.out.println("Hola mundo");
    }
}
