public class Empleado extends Persona{
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Salario: $" + salario);
    }
}
