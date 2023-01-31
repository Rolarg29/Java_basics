package rola.data.structures;

public class Perro {

    String name = "nombre del perro";
    String raza = "raza del perro";
    String color = "color del perro";

    public Perro(){}

    public Perro(String nombre){
        this.name = nombre;
    }

    public Perro(String nombre, String raza, String color){
        this.name = nombre;
        this.raza = raza;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "name='" + name + '\'' +
                '}';
    }

}
