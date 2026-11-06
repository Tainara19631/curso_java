package lista_decorator;

public class Atividade {
    public static void main(String[] args) {
        Acai acai = new AcaiSimples();

        acai = new GranolaDecorator(acai);

        System.out.println("Descrição: " + acai.getDescricao());
        System.out.println("Preço: R$ " + acai.getPreco());
    }
}
