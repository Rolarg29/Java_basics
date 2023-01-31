package rola.clases;

import rola.clases.Coche;

public class CocheElectrico extends Coche {//la clase CocheElectrico hereda de Coche los atributos genericos con el fin de no duplicar código.

    String motorElectrico;

    public CocheElectrico() {//Constructor vacio
    }
    public CocheElectrico(String motorElectrico) {//Constructor con parametros
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);//para no duplicar this con cada atributo
        this.motorElectrico = motorElectrico;
    }

    @Override//anotación @Override comprueba que sobreesccribe el metodo de la clase superior
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;//cambios que le estoy haciendo en el metodo acelerar
        super.acelerar(cantidadAjustada);// evitamos duplicar código y usamos el nuevo parametro de arriba
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
