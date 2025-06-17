public class CursoRegular extends Curso {
    public CursoRegular(String nombre, double costoBase) {
        super(nombre, costoBase);
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }
}
