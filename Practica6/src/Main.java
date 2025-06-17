

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("== Gerente Luis ==");
        Gerente gerente1 = new Gerente("Luis", 40, 900, 100);
        gerente1.mostrarInfo();

        System.out.println("\n== Gerente Ana ==");
        Gerente gerente2 = new Gerente("Ana", 30, 700, 200);
        gerente2.mostrarInfo();

        //Ejercicio 2

        try {
            CuentaAhorros ahorro = new CuentaAhorros("001A", 1000, 2.0);
            ahorro.mostrarDatos();

            System.out.println();

            // Este lanzará una excepción
            CuentaCorriente corriente = new CuentaCorriente("", 500, 200);
            corriente.mostrarDatos();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Ejercicio 3
        try {
            Auto auto = new Auto("Toyota", "Yaris");
            auto.mostrarInfo();

            System.out.println();

            // Esto causará error por marca nula
            Camion camion = new Camion(null, "Volvo FH");
            camion.mostrarInfo();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}