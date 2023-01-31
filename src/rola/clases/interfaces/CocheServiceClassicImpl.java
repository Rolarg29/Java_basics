package rola.clases.interfaces;

import rola.clases.Coche;
import rola.clases.CocheElectrico;
import rola.clases.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {
    /*
    la clase marca error hasta que implementemos algún método de esa interfaz, como se muestra abajo.
     */

    @Override//método abstracto se sobreescribe para implementar la interfaz y darle cuerpo
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico...");
        return new CocheElectrico();
    }

    @Override//debemos tener implementados los metodos de la interfaz para evitar errores
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clásico...");
    }
}
