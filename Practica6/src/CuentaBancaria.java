public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        if (!validarNumeroCuenta(numeroCuenta)) {
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    protected boolean validarNumeroCuenta(String numero) {
        return numero != null && !numero.trim().isEmpty();
    }

    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}
