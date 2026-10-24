package lista_interface;

public class SMS implements Notificacao{

    public void enviar(String mensagem){
        System.out.println(" SMS enviado: " + mensagem);
    }
    
}
