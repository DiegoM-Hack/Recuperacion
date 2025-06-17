public class Taxi extends Transporte {
    @Override
    public void iniciarViaje() {
        System.out.println("Taxi encendido");
    }

    @Override
    public double calcularDistancia(double tiempo) {
        double velocidad = 60; // km/h
        return velocidad * tiempo;
    }
}
