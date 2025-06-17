

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Calculadora calculadora = new Calculadora();
        int a = Calculadora.sumar(5,3);
        double b = calculadora.sumar(2.5,3.1);
        int c = Calculadora.sumar(1,2,3);
        System.out.println("Los resultados son: "+a+" "+b+" "+c);

        //Ejercicio 2
        Mensajero mensajero = new Mensajero();
        mensajero.enviar("Hola Mundo");
        mensajero.enviar("Hola Mundo", "Diego");
        mensajero.enviar("Hola Mundo", "Diego",3);

        //Ejercicio 3
        Persona persona = new Persona();
        persona.mostrar("Diego Montaluisa");
        persona.mostrar("Diego Montaluisa",34);
        persona.mostrar("Diego Montaluisa",34,"Quito");

        //Ejercicio 4
        Pokemon pokemon = new Pokemon();
        pokemon.mostrar("Pikachu");
        pokemon.mostrar("Pikachu","Electrico");
        pokemon.mostrar("Pikachu","Electrico",23,12);
    }
}