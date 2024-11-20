package Domain.Model.Ejercicio2;

public class Cuenta {
    protected double saldo;

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depositando $" + cantidad + "...");
        System.out.println("Deposito exitoso!");
        System.out.println("Saldo actual: $" + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

}
