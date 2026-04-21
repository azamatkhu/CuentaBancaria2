import java.io.*;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Si el saldo es insuficiente, tiramos una error SaldoInsuficienteException
    public void Retirar(double dinero) throws SaldoInsuficienteException {
        {
            if (dinero > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente!");
            }

            this.saldo -= dinero;

            System.out.println("Has retirado " + dinero);
            System.out.println("-------------------------------");
            System.out.println("Nuevo Saldo: " + this.saldo);
        }
    }
}