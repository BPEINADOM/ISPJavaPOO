package Domain.Model.Ejercicio2;

import Domain.Model.Ejercicio2.Interfaces.Retiro;

public class RetiroBancario implements Retiro {

    private Cuenta cuenta;

    public RetiroBancario(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= cuenta.saldo) {
            cuenta.saldo -= cantidad;
            System.out.println("Retirando $" + cantidad + "...");
            System.out.println("Retiro exitoso!");
            System.out.println("Saldo actual: $" + cuenta.saldo);
        }
    }
}
