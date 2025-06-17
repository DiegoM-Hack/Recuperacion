public class Usuario {
    private String clave;

    public void setClave(String clave) {
        if (clave != null && clave.length() >= 8) {
            this.clave = clave;
            System.out.println("Clave aceptada: " + clave);
        }else {
            System.out.println("Clave no aceptada");
        }
    }
}
