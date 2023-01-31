package rola.data.structures;

import java.util.Arrays;

public class MainArrays {

    public static void main(String[] args) {
        int[] notas1 = new int[10];//indicamos que creamos un array de 10 elementos
        int[] notas2 = {6, 10, 9, 7, 8};//declaramos un array de 10 elementos con valores ya asignados

        notas1[0] = 9;
        notas1[1] = 8;
        notas1[2] = 10;
        notas1[3] = 6;
        notas1[4] = 7;
        notas1[5] = 8;

        System.out.println(notas1[0]);
        System.out.println("=for=================================");

        //recorremos el array

        //for
        for(int i = 0; i < notas2.length; i++){
            System.out.println(notas2[i]);
        }

        //foreach
        System.out.println("=for each================================");
        for(int item: notas2){
            System.out.println(item);
        }
        System.out.println("=metodos=========================");


        //metodos de arrays

        //binary search
        int[] notas3 = {6, 10, 9, 7, 8};
        //notas3.binarySearch(notas3, 8); NO PUTAS FUNCIONA

        //sort
        //notas3.sort(notas3); NO PUTAS FUNCIONA





    }
}
