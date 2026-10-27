package lista_revisao1610;

public class Atividade {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(-1500);
        produto.setQuantidade(10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        Retangulo r = new Retangulo("Retângulo", 5, 3);

        r.exibirNome();

        System.out.println("Área: " + r.calcularArea());

        Desenvolvedor desenvolvedor = new Desenvolvedor("Ana", 3000);
        Gerente gerente = new Gerente("Carlos", 5000);

        Notificador email = new Email();

        FolhaPagamento folhaEmail = new FolhaPagamento(email);

        folhaEmail.pagar(desenvolvedor);
        folhaEmail.pagar(gerente);

        Notificador sms = new SMS();

        FolhaPagamento folhaSMS = new FolhaPagamento(sms);

        folhaSMS.pagar(desenvolvedor);
        folhaSMS.pagar(gerente);
    }   

}
