public class EmpleadoFijo extends Empleado {
    private double salario;

    public EmpleadoFijo(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
