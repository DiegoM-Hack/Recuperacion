public class CuentaBancaria {
    private String titular = "";
    private double saldo = 0.0;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}
