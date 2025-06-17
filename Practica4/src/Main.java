
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Triangulo(5, 3);

        System.out.println("Área del cuadrado: " + f1.calcularArea());
        System.out.println("Área del triángulo: " + f2.calcularArea());

        //Ejerccio 2
        Empleado empleado = new EmpleadoFijo(600);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras(200,8);
        System.out.println("Su salario: " + empleado.calcularSalario());
        System.out.println("Su salario: " + empleado2.calcularSalario());

        //Ejercicio 3
        Tranporte bus = new Bus();
        Tranporte bicicleta = new Bicicleta();
        bus.iniciarViaje();
        bicicleta.iniciarViaje();

        //Ejercicio 4
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setEdad(-3);

        //Ejercicio 5
        Usuario usuario = new Usuario();
        usuario.setClave("clave123");
        usuario.setClave("abc");

        //Ejercico 6
        Estudiante estudiante = new Estudiante();
        estudiante.setNota(12.3);
        estudiante.setNota(8);




    }
}