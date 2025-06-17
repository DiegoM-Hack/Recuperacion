public abstract class Transporte {
    protected String direccion;
    protected String hora;

    // Metodo abstracto
    public abstract void iniciarViaje();

    // Sobrecarga: solo dirección
    public void registrarRuta(String direccion) {
        if (!validarDireccion(direccion)) {
            throw new IllegalArgumentException("Dirección inválida");
        }
        this.direccion = direccion;
        System.out.println("Ruta registrada: " + direccion);
    }

    // Sobrecarga: dirección + hora
    public void registrarRuta(String direccion, String hora) {
        if (!validarDireccion(direccion)) {
            throw new IllegalArgumentException("Dirección inválida");
        }
        this.direccion = direccion;
        this.hora = hora;
        System.out.println("Ruta registrada: " + direccion + " a las " + hora);
    }

    // Validación de dirección
    protected boolean validarDireccion(String direccion) {
        return direccion != null && !direccion.trim().isEmpty();
    }

    // Metodo adicional simulado: velocidad (km/h) * tiempo (h)
    public abstract double calcularDistancia(double tiempo);

}
