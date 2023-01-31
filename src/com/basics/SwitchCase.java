package com.basics;

public class SwitchCase {

    public static void main(String[] args) {

        String clima = "rainy";

        switch (clima){// Cuando queremos evaluar multiples condiciones 

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            case "rainy":
                System.out.println("El tiempo es lluvioso");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
                break;
        }
    }

}
