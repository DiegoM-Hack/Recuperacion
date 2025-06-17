public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        if (!validarPersona(nombre, edad)) {
            throw new IllegalArgumentException("Error: El nombre no puede estar vacío y la edad debe ser mayor o igual a 18");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    protected boolean validarPersona(String nombre, int edad) {
        return edad >= 18 && nombre != null && !nombre.trim().isEmpty();
    }

    public abstract void mostrarDatos();
}
