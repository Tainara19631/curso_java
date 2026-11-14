package lista_observer;

public class Atividade {
    public static void main(String[] args) {
        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro();

        voo.adicionarObservador(passageiro);

        voo.mudarStatus("Embarque iniciado");

        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(painel);

        voo.mudarStatus("Atrasado");

        Estoque estoque = new Estoque();

        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(10);

        estoque.setQuantidade(30);

    }
}
