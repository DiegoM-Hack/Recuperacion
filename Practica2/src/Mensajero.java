public class Mensajero {

    public void enviar(String texto){
        System.out.println(texto);
    }
    public void enviar(String texto, String destinatario){
        System.out.println(texto+" "+destinatario);
    }
    public void enviar(String texto, String destinatario, int prioridad){
        System.out.println(texto+" "+destinatario+ " " +prioridad);
    }

}
