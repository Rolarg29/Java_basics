package com.basics;

public class IfElse {

    public static void main(String[] args) {


        boolean check = 5 < 10;

        int number1 = 50;
        int number2 = 10;
        int number3 = 200;
        int number4 = 100;

        if(number1 < number2 && number2 < number3){
            System.out.println("verdadero");
        } else if (number3 < number4){
            System.out.println("otro verdadero xd");
        } else {
            System.out.println("false pequeñe");
        }
        System.out.println("Fin");
    }
}
