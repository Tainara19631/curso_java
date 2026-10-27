package lista_revisao1610;

public class Email implements Notificador{
     @Override 
    public void notificar(String mensagem){
    System.out.println("E-mail enviado: " + mensagem);
    }

}
