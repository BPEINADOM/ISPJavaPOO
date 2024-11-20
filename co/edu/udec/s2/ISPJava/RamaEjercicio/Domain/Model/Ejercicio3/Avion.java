package Domain.Model.Ejercicio3;

import Domain.Model.Ejercicio3.Interfaces.CargarMercancias;
import Domain.Model.Ejercicio3.Interfaces.Conduccion;

public class Avion implements CargarMercancias, Conduccion {

    @Override
    public void conducir() {
        System.out.println("Avion en movimiento.");
    }

    @Override
    public void cargarMercancia(double cantidad) {
        System.out.println("El Avion carga actualmente con " + cantidad + " toneladas.");
    }
}
