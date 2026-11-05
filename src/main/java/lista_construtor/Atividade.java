package lista_construtor;

public class Atividade {
    public static void main(String[] args) {
        Agendamento agendamento = new Agendamento(
    "Thor",
    "banho",
    "14h",
    true,
    true,
    false,
    "alérgico a shampoo",
    10.0
);

Agendamento agendamento1 = new Agendamento(
    "Luna",
    "tosa",
    "14h",
    false,
    false,
    false,
    "sem observacao",
    0.00
);

Agendamento agendamento2 = new Agendamento(
    "Mel",
    "banho",
    "16h",
    false,
    false,
    true,
    "Sem observação",
    0.00
);

    agendamento.mostrar();
    agendamento1.mostrar();
    agendamento2.mostrar();
    }
}
