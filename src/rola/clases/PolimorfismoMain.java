package rola.clases;

public class PolimorfismoMain {

    public static void main(String[] args) {

        //Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();//aqui lo tratamoos especificamente el tipo de coche elctrico

        CocheHibrido coche3 = new CocheHibrido();

        //polimorfismo

        Coche coche4 = new CocheElectrico();//aqui podemos manejar todos como coches generales

        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }

        if (coche4 instanceof CocheHibrido){
            System.out.println("Coche Hibrido");
        }

        /*
        Cuando NO utilizamos polimorfismo trabajamos directamente la clase hija en concreto.
        Al usar polimorfismo trabajamos con la clase padre/que está por encima con el objetivo de tratar a todos los objetos por igual.

        Nos puede servir para arrays/estructuras de control, ya que deben ser del mismo tipo(coche)
        a pesar de que sean diferentes subtipos(Eléctrico, hibrido)

        Al emplear el tipo/clase base java nos permite usar estructuras de datos con multiples objetos por igual

        o sea para agarrar parejo xd
         */




    }
}
