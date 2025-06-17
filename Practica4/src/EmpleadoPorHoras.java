public class EmpleadoPorHoras extends Empleado {
    private double tarifa;
    private int horas;

    public EmpleadoPorHoras(double tarifa, int horas) {
        this.tarifa = tarifa;
        this.horas = horas;
    }
    @Override
    public double calcularSalario() {
        return tarifa*horas;
    }
}
