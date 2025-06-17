public class Estudiante extends Persona {
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        super(nombre, edad);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public boolean esAptoBeca() {
        return promedio >= 8.5;
    }

    // Sobrecarga de métodos inscribir
    public void inscribir(String semestre) {
        System.out.println(nombre + " inscrito en el semestre: " + semestre);
    }

    public void inscribir(String semestre, String modalidad) {
        System.out.println(nombre + " inscrito en el semestre: " + semestre + " en modalidad: " + modalidad);
    }

    public double getPromedio() {
        return promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}
