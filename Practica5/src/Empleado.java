public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        if (!validarNombre(nombre)) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre = nombre;
    }

    // Metodo abstracto
    public abstract double calcularSalario();

    // Metodo abstracto para sobreescribir
    public abstract void mostrarDatos();

    // Validacion
    protected boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}
