public abstract class Curso {

    protected String nombre;
    protected double costoBase;

    public Curso(String nombre, double costoBase) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede estar vacío.");
        }
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public abstract double calcularCosto();

    // Sobrecarga del metodo mostrarInfo
    public void mostrarInfo(String nombre) {
        System.out.println("Curso: " + nombre);
    }

    public void mostrarInfo(String nombre, double costo) {
        System.out.println("Curso: " + nombre + " | Costo: $" + costo);
    }

    // Metodo para calcular descuento
    public double calcularDescuento() {
        double costo = calcularCosto();
        if (costo > 150) {
            return costo * 0.10; // 10% de descuento
        }
        return 0.0;
    }


}
