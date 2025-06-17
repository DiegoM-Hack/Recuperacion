
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Curso curso1 = new CursoRegular("Java Básico", 100);
        Curso curso2 = new CursoCertificado("Java Avanzado", 150, 50);

        // Calculo de costo
        System.out.println("Costo CursoRegular: $" + curso1.calcularCosto());
        System.out.println("Costo CursoCertificado: $" + curso2.calcularCosto());

        // Mostrar info (sobrecarga)
        curso1.mostrarInfo("Java Básico");
        curso2.mostrarInfo("Java Avanzado", curso2.calcularCosto());

        // Mostrar descuentos
        System.out.println("Descuento para curso1: $" + curso1.calcularDescuento());
        System.out.println("Descuento para curso2: $" + curso2.calcularDescuento());

        //Ejercicio 2
        try {
            Empleado empleado1 = new EmpleadoFijo("Luis", 500);
            Empleado empleado2 = new EmpleadoPorComision("María", 1000, 0.10);

            // Mostrar salarios
            System.out.println("Salario Luis: $" + empleado1.calcularSalario());
            System.out.println("Salario María: $" + empleado2.calcularSalario());

            // Mostrar datos
            empleado1.mostrarDatos();
            empleado2.mostrarDatos();

            // Aplicar bonos
            ((EmpleadoFijo) empleado1).aplicarBono();
            ((EmpleadoPorComision) empleado2).aplicarBono();

            // Intentar crear con nombre vacío
            Empleado eInvalido = new EmpleadoFijo("", 500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Ejercicio 3
        try {
            Transporte taxi = new Taxi();
            Transporte patineta = new Patineta();

            // Registrar rutas
            taxi.registrarRuta("Av. Quito", "08:00"); // Dirección + hora
            patineta.registrarRuta("Parque Central"); // Solo dirección

            // Iniciar viaje
            taxi.iniciarViaje();       // Taxi encendido
            patineta.iniciarViaje();   // Patineta activada

            // Calcular distancia recorrida en 2 horas
            System.out.println("Taxi recorrió: " + taxi.calcularDistancia(2) + " km");        // 120 km
            System.out.println("Patineta recorrió: " + patineta.calcularDistancia(2) + " km"); // 30 km

            // Prueba de error
            taxi.registrarRuta("", "08:00"); // Dirección inválida → lanza excepción

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}