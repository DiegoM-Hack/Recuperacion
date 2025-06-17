public class Vehiculo {
    public String tipo = "Automóvil";
    public int velocidadMaxima;
    private String placa = "";
    private String marca = "Toyota";

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarDatos(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
    }
}
