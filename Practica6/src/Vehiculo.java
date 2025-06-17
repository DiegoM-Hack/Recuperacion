public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        if (!validarMarca(marca)) {
            throw new IllegalArgumentException("Error: La marca no puede ser nula ni vacía");
        }
        this.marca = marca;
        this.modelo = modelo;
    }

    protected boolean validarMarca(String marca) {
        return marca != null && !marca.trim().isEmpty();
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
