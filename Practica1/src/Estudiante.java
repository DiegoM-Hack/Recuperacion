public class Estudiante {
    private String matricula;
    private String nombre = "";
    private String carrera = "";


    public void setMatricula(String matricula) {
            this.matricula = matricula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public String getNombre() {
        return nombre;
    }
}
