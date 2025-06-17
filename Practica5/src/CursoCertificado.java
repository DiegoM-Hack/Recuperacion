public class CursoCertificado extends Curso {
    private double recargo;

    public CursoCertificado(String nombre, double costoBase, double recargo) {
        super(nombre, costoBase);
        this.recargo = recargo;
    }

    @Override
    public double calcularCosto() {
        return costoBase + recargo;
    }
}

