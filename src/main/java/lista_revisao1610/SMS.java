package lista_revisao1610;

public class SMS implements Notificador{
     @Override 
    public void notificar(String mensagem){
    System.out.println("SMS enviado: " + mensagem);
    }

}

