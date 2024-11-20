import Domain.Model.Ejercicio1.Camion;
import Domain.Model.Ejercicio1.Coche;

public class MantenimientoLSP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Camion camion = new Camion();
        System.out.println("- Mantenimiento del camion:");
        camion.limpiar();
        camion.reparar();

        System.out.println("*********************************************");
        
        Coche coche = new Coche();
        System.out.println("- Mantenimiento del coche:");
        camion.limpiar();
        coche.reparar();

        System.out.println("*********************************************");

    }
}
