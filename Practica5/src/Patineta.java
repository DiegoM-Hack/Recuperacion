public class Patineta extends Transporte{
    @Override
    public void iniciarViaje() {
        System.out.println("Patineta activada");
    }

    @Override
    public double calcularDistancia(double tiempo) {
        double velocidad = 15; // km/h
        return velocidad * tiempo;
    }
}
