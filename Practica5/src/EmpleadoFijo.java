public class EmpleadoFijo extends Empleado {

    private double salarioBase;
    private int aniosAntiguedad;

    // Constructor sin antigüedad
    public EmpleadoFijo(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = 0;
    }

    // Constructor con antigüedad (sobrecarga)
    public EmpleadoFijo(String nombre, double salarioBase, int aniosAntiguedad) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado Fijo: " + nombre + " | Salario Base: $" + calcularSalario());
    }

    public void aplicarBono() {
        if (aniosAntiguedad > 5) {
            salarioBase += 100; // Bono por antigüedad
            System.out.println("Bono aplicado a " + nombre + " por antigüedad.");
        }
    }
}
