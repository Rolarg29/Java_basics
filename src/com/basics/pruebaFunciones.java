package com.basics;

public class pruebaFunciones {

    public static void main(String[] args) {
        Funciones.holaMundo("Juan");
        /*
         aqui se está invocando una función de otra clase pero no se puede ya que su acceso es "private"
         por lo que se cambia a "public" para que sea accesible
         con "protected" tambien funciona ya que está dentro del mismo paquete
         */
    }
}
