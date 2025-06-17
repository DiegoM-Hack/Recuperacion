public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, int edad, double salario, double bono) {
        super(nombre, edad, salario);
        if (salario > 800) {
            this.bono = bono;
        } else {
            this.bono = 0;
            System.out.println("Advertencia: Bono no aplicado para " + nombre + " (salario insuficiente)");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if (bono > 0) {
            System.out.println("Bono aplicado: $" + bono);
            System.out.println("Salario total: $" + (salario + bono));
        } else {
            System.out.println("Sin bono.");
        }
    }
}
