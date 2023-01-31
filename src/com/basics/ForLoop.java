package com.basics;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++){
            //System.out.println("Hola bucle " + i);
            if(i==6)
                continue;//omite el código siguiente dentro del bucle y salta a la proxima iteración


            if(i !=0){
                if(i%2 == 0){
                    System.out.println(i + " es número par");
                } else {
                    System.out.println(i + " es número impar");
                }
            }


            if(i==15)
                break;//rompe con el bucle y sale

            // se suele usar para iterar arrays
            // estructura de control determinada
        }
        System.out.println("<<<FIN DEL CÓDIGO>>>");

    }
}
