import Domain.Model.Ejercicio3.CamionCarga;
import Domain.Model.Ejercicio3.Avion;

public class VehiculoLSP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        CamionCarga camion = new CamionCarga();
        camion.conducir();
        camion.cargarMercancia(25);

        System.out.println("*********************************************");

        Avion avion = new Avion();
        avion.conducir();
        avion.cargarMercancia(91);

        System.out.println("*********************************************");
    }
}
