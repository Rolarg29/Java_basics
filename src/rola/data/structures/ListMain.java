package rola.data.structures;


import java.util.ArrayList;
import java.util.List;

public class ListMain { //List es una interfaz de tipo ArrayList

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();//creamos una lista vacía

        nombres.add("Luna");
        nombres.add("Nina");
        nombres.add("Rolando");
        nombres.add("Andrea");
        nombres.add("Ricardo");
        nombres.add("Scarlet");

        System.out.println(nombres);//nos muestra la lista completa
        System.out.println("===============================================");

        //bucle for each para iterar cada nombre de la lista nombres
        for(String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("===============================================");


        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("BMW"));
        coches.add(new Coche("Audi"));
        coches.add(new Coche("Mercedes"));
        coches.add(new Coche("Renault"));

        System.out.println(coches);
        System.out.println(" ==============================================");

        for(Coche coche : coches) {
            System.out.println(coche);
        }
        System.out.println("===============================================");

        List<Perro> perros = new ArrayList<>();

        perros.add(new Perro("Luna", "Schnauzer", "negro"));
        perros.add(new Perro("Narda", "Boxer", "Blanco y café"));
        perros.add(new Perro("Jiemba", "Pastor Australiano", "Gris con negro y café"));
        perros.add(new Perro("Jack", "Yorkshire", "café y gris"));

        System.out.println(perros);
        System.out.println("===============================================");

        for(Perro perro : perros) {
            System.out.println("Nombre: " + perro.name);
            System.out.println("Raza: " + perro.raza);
            System.out.println("Color: " + perro.color);
            System.out.println("------------------------------");
        }

        System.out.println("===============================================");

        System.out.println(perros.get(2).color);

    }
}
