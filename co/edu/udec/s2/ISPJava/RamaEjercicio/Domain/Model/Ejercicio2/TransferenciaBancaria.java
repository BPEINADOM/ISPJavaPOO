package Domain.Model.Ejercicio2;

import Domain.Model.Ejercicio2.Interfaces.Transferencia;

public class TransferenciaBancaria implements Transferencia {

    private Cuenta cuenta;

    public TransferenciaBancaria(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void transferir(double cantidad, String cuentaDestino) {
        if (cantidad <= cuenta.saldo) {
            cuenta.saldo -= cantidad;
            System.out.println("Transfiriendo $" + cantidad + " a la cuenta " + cuentaDestino + "...");
            System.out.println("Transferencia completada!");
            System.out.println("Saldo actual: $" + cuenta.saldo);
        } else {
            System.out.println("No hay suficiente saldo para realizar la transferencia.");
        }
    }
}
