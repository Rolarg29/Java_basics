package rola.clases;

import rola.clases.Coche;
import rola.clases.CocheElectrico;

public class CocheMain {

    public static void main(String[] args) {

        String cocheStr = "Mustang";//Esto es una variable
        Coche cocheObj = new CocheHibrido();//Aquí estamos creando un objeto/instancia de una clase

        //Cada vez que creamos un objeto estamos creando una INSTANCIA de una clase
        Coche cocheObj2 = new CocheElectrico("rojo", "toyota", "camry", 1575.80, 5.4, "GTX");

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1305.70;

        System.out.println(cocheObj2);

        CocheElectrico cocheElec01 = new CocheElectrico();

        cocheElec01.motorElectrico = "Un motor electrico x";
        cocheElec01.color = "azul metálico";
        cocheElec01.fabricante = "Ferrari";
        cocheElec01.modelo = "Mustang";
        cocheElec01.peso = 1456.5;
        cocheElec01.largo = 4.3;

        System.out.println(cocheElec01);

        CocheElectrico cocheElec02 = new CocheElectrico("morado", "nissan", "altima",
                1575.80, 5.4, "TXR");

        System.out.println(cocheElec02);

        cocheElec02.acelerar(55);

        System.out.println(cocheElec02);


    }

}
