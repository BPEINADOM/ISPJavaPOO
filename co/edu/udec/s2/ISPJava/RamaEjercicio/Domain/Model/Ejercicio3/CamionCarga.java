package Domain.Model.Ejercicio3;

import Domain.Model.Ejercicio3.Interfaces.CargarMercancias;
import Domain.Model.Ejercicio3.Interfaces.Conduccion;

public class CamionCarga implements CargarMercancias, Conduccion {

    @Override
    public void conducir() {
        System.out.println("Camion de carga en movimiento.");
    }

    @Override
    public void cargarMercancia(double cantidad) {
        System.out.println("El Camion carga actualmente con " + cantidad + " toneladas.");
    }

}
