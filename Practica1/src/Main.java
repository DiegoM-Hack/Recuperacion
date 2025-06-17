import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Producto p1 = new Producto();
        System.out.println(p1.getNombre());

        //Ejercicio 2
        Estudiante p2 = new Estudiante();
        p2.setMatricula("2025A001");
        System.out.println("Matricula asignada con exito");

        //Ejercicio 3
        Persona p3 = new Persona();
        p3.setEdad(25);
        System.out.println("Edad asignada con exito: "+p3.getEdad());

        //Ejercicio 4
        Cuenta c1 = new Cuenta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una contraseñia" );
        String clave = sc.nextLine();
        c1.setPassword(clave);
        System.out.println("Clave guardada con exito");

        //Ejercicio 5
        Registro reg = new Registro();
        System.out.println("El codigo asignado es: "+reg.getCodigo());

        //Ejercicio 6
        Estudiante est = new Estudiante();
        est.setCarrera("Programacion");
        est.setNombre("Diego Montaluisa");
        System.out.println("El nombre es: "+est.getNombre());
        System.out.println("La carrera es: "+est.getCarrera());

        //Ejercicio 7
        Producto p4 = new Producto();
        p4.setNombre1("Diego Montaluisa");
        p4.setPrecio(12.45);
        System.out.println("El nombre es: "+p4.getNombre1());
        System.out.println("El precio es: "+p4.getPrecio());

        //Ejercicio 8
        Libro lib = new Libro();
        lib.setTitulo("Don Quijote");
        lib.setAnioPublicacion(2021);
        System.out.println("El titulo es: "+lib.getTitulo());
        System.out.println("El año de publicacion es: "+lib.getAnioPublicacion());

        //Ejercicio 9
        CuentaBancaria cb = new CuentaBancaria();
        cb.setTitular("Diego Montaluisa");
        cb.setSaldo(23.45);
        System.out.println("El titular es: "+cb.getTitular());
        System.out.println("El saldo es: "+cb.getSaldo());

        //Ejercicio 10
        Empleado emp = new Empleado();
        emp.horario = "08:00 - 17:00";
        emp.setNombre("Diego Montaluisa");
        emp.setSalario(23.45);
        emp.mostrar();

        //Ejercicio 11
        Vehiculo veh = new Vehiculo();
        veh.velocidadMaxima = 50;
        veh.setPlaca("aad-1234");
        veh.mostrarDatos();

        //Ejercicio 12
        Cliente cli = new Cliente();
        cli.setNombre("Diego Montaluisa");
        cli.setTelefono("09123783");
        cli.codigoCliente = 1234;
        cli.verCliente();

        //Ejercicio 13
        Pelicula pel = new Pelicula();
        pel.titulo = "El amanecer de los muertos";
        pel.setAnio(2021);
        pel.setDirector("Diego Montaluisa");
        pel.setDuracion(1.30);
        pel.mostrarFicha();

    }
}