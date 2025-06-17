
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        new Perro().hacerSonido();
        new Gato().hacerSonido();
        Animal[] animales = {new Perro(), new Gato()};

        //Ejercicio 2
        new Moto().arrancar();
        new Carro().arrancar();
        Vehiculo[] lista = {new Moto(), new Carro()};

        //Ejercicio 3
        new Gerente().mostrarInfo();
        new Asistente().mostrarInfo();
        Empleado[] personal = {new Gerente(), new Asistente()};







    }
}