package com.basics;

public class Funciones {

    public static void main(String[] args) {

        //holaMundoTriple();

        holaMundo("Rolando");// 2.1- aquí está recibiendo un argumento/parametro para que lo use la función
        holaMundo("Andrea");

        String txtDevuelto = devolverHola(); // 3.1- el texto retornado es asignado a una variable
        System.out.println(txtDevuelto); // 3.2- Dicha variable se imprime con el texto guardado

        int suma = sum(5, 5);
        System.out.println(suma);

        buenosDias();
        buenosDias("Andrea");
        buenosDias("Rolando", "Ramirez");

    }

    private static void holaMundoTriple() { // 1- Esta es una función que imprime hola mundo 3 veces
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }
    //tipo de retorno de dato "void" no regresa ningún dato



    protected static void holaMundo(String name) { // 2- Esta es una función que recibe un parametro String
        System.out.println("Hola " + name);
    }
    // modificador "protected" permite que solo clases hijas o del mismo paquete podrán acceder a la función
    // "Protected" va más orientado a objetos para las clases hijas



    private static String devolverHola() { // 3- Esta función retorna un dato string
        return "Hola";
    }
    // tipo de retorno de dato "string" retorna un tipo de dato string



    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
    // tipo de retorno de dato "int" retorna un tipo de dato numérico int
    // modificador "private" indica que la visibilidad de la función SOLO es accesible dentro de esta clase



    // SOBRECARGA DE FUNCIONES
    // una misma función con diferentes variaciones
    // se duplica la misma función, pero con diferentes parámetros
    // permite duplicado usando diferente cantidad de parámetros o misma cantidad pero diferente tipo
    private static void buenosDias(){
        System.out.println("Buenos dias :)");
    }

    private static void buenosDias(String name){
        System.out.println("Hola " + name + ", buenos dias ;)");
    }

    private static void buenosDias(String name, String surname){
        System.out.println("Hola señor " + name + " " + surname + ", que tenga un excelente día hoy ;)");
    }
}
