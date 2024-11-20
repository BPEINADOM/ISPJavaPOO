import Domain.Model.Ejercicio2.Cuenta;
import Domain.Model.Ejercicio2.PagoFacturaBancaria;
import Domain.Model.Ejercicio2.RetiroBancario;
import Domain.Model.Ejercicio2.TransferenciaBancaria;

public class OperacionBancariaLSP {

    public static void main(String[] args) {
        
        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Cuenta cuenta = new Cuenta();
        cuenta.depositar(670500.0);

        System.out.println("*********************************************");

        TransferenciaBancaria transferencia = new TransferenciaBancaria(cuenta);
        transferencia.transferir(150000.0, "23230432");

        System.out.println("*********************************************");

        RetiroBancario retiro = new RetiroBancario(cuenta);
        retiro.retirar(50500.0);

        System.out.println("*********************************************");

        PagoFacturaBancaria pagoFactura = new PagoFacturaBancaria(cuenta);
        pagoFactura.pagarFactura(90900.0, "Factura de Internet");

        System.out.println("*********************************************");

    }
}
