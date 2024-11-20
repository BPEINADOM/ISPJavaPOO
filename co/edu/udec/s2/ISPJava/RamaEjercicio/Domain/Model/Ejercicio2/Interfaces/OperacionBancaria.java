package Domain.Model.Ejercicio2.Interfaces;

public interface OperacionBancaria {

    void transferir(double cantidad, String cuentaDestino);

    void retirar(double cantidad);

    void pagarFactura(double cantidad, String factura);
    
}
