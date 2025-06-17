
public class Main {
    public static void main(String[] args) {

        try {
            EstudianteBecado est1 = new EstudianteBecado("Luis", 20, "Sistemas", 9.2, "Académica");
            est1.mostrarDatos();
            est1.aplicarDescuento();

            System.out.println();

            EstudianteBecado est2 = new EstudianteBecado("Ana", 19, "Derecho", 8.0, "Económica");
            est2.mostrarDatos();
            est2.aplicarDescuento();

            // Prueba con nombre vacío (debe lanzar error)
            // EstudianteBecado est3 = new EstudianteBecado("", 19, "Medicina", 9.0, "Académica");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}