package lista_heranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {
    public void aprovarFerias(String quem){
       System.out.println(nome + " aprovou as férias de " + quem + "."); 
    }
    @Override
    public void exportar() {
        System.out.println("Exportando dados ");
    }

   @Override
    public void notificar(String nome) {
    System.out.println("Notificação enviada para " + nome);
}
}
