public class EmpleadoPorComision extends Empleado {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, double ventas, double porcentajeComision) {
        super(nombre);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return ventas + (ventas * porcentajeComision);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado por Comisión: " + nombre + " | Salario con comisión: $" + calcularSalario());
    }

    public void aplicarBono() {
        if (ventas > 1000) {
            ventas += 100; // Bono por alta venta
            System.out.println("Bono aplicado a " + nombre + " por ventas altas.");
        }
    }
}
