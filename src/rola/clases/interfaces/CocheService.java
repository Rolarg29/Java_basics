package rola.clases.interfaces;

import rola.clases.Coche;

public interface CocheService {

    /*
    Desacoplar el código
    podemos utilizar cualquier interfaz y modificarlas sin tener que tocar el archivo main, sino directo en la interfaz que este implementa
     */

    public Coche crearCocheDemo();//Declaración del metodo sin cuerpo
    String identificador = "";

    public void destruirCoche(Coche coche);


}
