package rola.data.structures;

public class Coche {

    String name = "nombre del coche";

    public Coche(){}

    public Coche(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
