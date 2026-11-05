package lista_builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public void mostrar() {
    System.out.println("Agendamento realizado!");
    System.out.println("Pet: " + getNomePet());
    System.out.println("Serviço: " + getServico());
    System.out.println("Horário: " + getHorario());
    System.out.println("Perfume: " + isPerfume());
    System.out.println("Laço: " + isLaco());
    System.out.println("Hidratação: " + isHidratacao());
    System.out.println("Observação: " + getObservacao());
    System.out.println("Desconto: " + getDesconto());
}
}
