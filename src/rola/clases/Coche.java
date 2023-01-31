package rola.clases;

public abstract class Coche {//una clase abstracta solo puede ser instanciada a traves de las clases hijas
    /*
    las clases abstractas pueden definir cosas en común, pero son completadas por las clases hijas
     */

    //atributos
    //caracteristicas del objeto
   String color;
   String fabricante;
   String modelo;
   Double peso;
   Double largo;
   Integer velocidad = 0;

    //constructores
    //metodos especiales para crear objetos a partir de la clase
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }






    public Coche() {

    }

    //comportamiento / metodos
    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
