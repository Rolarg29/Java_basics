package rola.clases.interfaces;

import rola.clases.Coche;

public class InterfacesMain {

    public static void main(String[] args) {


        CocheService servicio1 = new CocheServiceClassicImpl();
        CocheService servicio2 = new CocheServiceSportImpl();

        Coche auto1 = servicio1.crearCocheDemo();

        Coche auto2  = servicio2.crearCocheDemo();
    }
}
