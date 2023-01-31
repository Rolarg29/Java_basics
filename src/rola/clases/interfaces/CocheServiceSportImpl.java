package rola.clases.interfaces;

import rola.clases.Coche;
import rola.clases.CocheElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche deportivo...");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche deportivo...");

    }
}
