public class Pelicula {
    public String titulo = "";
    public int anio = 2024;
    private String director = "";
    private double duracion = 0.0;

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void mostrarFicha(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Anio: " + anio);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion);
    }
}
