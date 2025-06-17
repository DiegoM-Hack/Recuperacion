public class Camion extends Vehiculo{
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Vehículo pesado");
    }
}
