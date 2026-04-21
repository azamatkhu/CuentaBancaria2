// Esta clase utilizamos para crear un error personalizado, utilizando extends Exception
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
