public class CuentaAhorros extends CuentaBancaria{
    private double interesMensual; // Porcentaje, ej: 2.0 para 2%

    public CuentaAhorros(String numeroCuenta, double saldo, double interesMensual) {
        super(numeroCuenta, saldo);
        this.interesMensual = interesMensual;
    }

    public void aplicarInteres() {
        double interes = saldo * (interesMensual / 100);
        saldo += interes;
    }

    @Override
    public void mostrarDatos() {
        aplicarInteres();
        System.out.println("Cuenta de Ahorros:");
        super.mostrarDatos();
        System.out.println("Interés aplicado: " + interesMensual + "%");
    }
}
