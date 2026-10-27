package lista_singleton;

public class Atividade {
    public static void main(String[] args) {
        ContadorVisitas contador = ContadorVisitas.getInstancia();

contador.registrarVisita();
contador.registrarVisita();
contador.registrarVisita();

System.out.println(contador.getTotal());


        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();

        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: "
                + telaProdutos.getQuantidadeItens());

        System.out.println("Itens vistos pela tela de promoções: "
                + telaPromocoes.getQuantidadeItens());
    }
}
