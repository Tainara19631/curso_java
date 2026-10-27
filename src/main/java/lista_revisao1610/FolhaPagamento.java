package lista_revisao1610;

public class FolhaPagamento {
    private Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
       double salario = f.calcularSalario();

         String mensagem = "Olá, " + f.getNome()
                + "! Seu salário é R$ " + salario;

        notificador.notificar(mensagem);
    }

}
