public class Estudiante {
    private double nota;

    public void setNota(double nota) {

        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Nota aceptada: " + nota);
        }else{
            System.out.println("Nota invalida: " + nota);
        }
    }
}
