package Domain.Model.Ejercicio1;

import Domain.Model.Ejercicio1.Interfaces.Limpieza;
import Domain.Model.Ejercicio1.Interfaces.Reparacion;

public class Coche implements Limpieza, Reparacion {

    @Override
    public void reparar() {
        System.out.println("Reparando el coche...");
        System.out.println("Reparacion completada!");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el coche...");
        System.out.println("Limpieza completada!");
    }

}
