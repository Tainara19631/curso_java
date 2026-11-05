package lista_builder;

public class Atividade {
    public static void main(String[] args) {
        Agendamento agendamento = Agendamento.builder()
        .nomePet("Thor")
        .servico("Banho")
        .horario("14h")
        .perfume(true)
        .laco(true)
        .hidratacao(false)
        .observacao("Alérgico a shampoo")
        .desconto(10.0)
        .build();

        agendamento.mostrar();
    }
}