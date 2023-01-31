package com.basics;

public class TryCatchMain {//mos permite continuar la ejecución del programa a pesar de algún error

    public static void main(String[] args) {

        try {//tenemos la excepción o código problemático
            int result = 5 / 5;
        } catch (ArithmeticException e) {//tenemos lo que hacemos con la excepción
            e.printStackTrace();//nos REGISTRA  donde ha estado el fallo
        } finally {//se ejecuta SIEMPRE haya error o no, usualmente para limpiar el ambiente y ahorrar recursos
            System.out.println("Cierre de recursos");
        }


        System.out.println("Fin");
    }
}
