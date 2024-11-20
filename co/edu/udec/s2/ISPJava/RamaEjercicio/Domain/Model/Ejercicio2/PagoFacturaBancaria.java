package Domain.Model.Ejercicio2;

import Domain.Model.Ejercicio2.Interfaces.PagoFactura;

public class PagoFacturaBancaria implements PagoFactura {

    private Cuenta cuenta;

    public PagoFacturaBancaria(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void pagarFactura(double cantidad, String factura) {
        if (cantidad <= cuenta.saldo) {
            cuenta.saldo -= cantidad;
            System.out.println("Procesando pago de la factura " + factura + " con valor de $" + cantidad + "...");
            System.out.println("Factura cancelada con exito!");
            System.out.println("Saldo Actual: $" + cuenta.saldo);
        }
    }
}
