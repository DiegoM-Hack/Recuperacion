public class Auto extends Vehiculo{
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Vehículo liviano");
    }
}
