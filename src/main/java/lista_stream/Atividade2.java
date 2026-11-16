package lista_stream;
import java.util.List;

public class Atividade2 {
    public static void main(String[] args) {
        List<String> frutas = List.of("maçã", "banana", "morango");
        List<String> frutasMaiusculo = frutas.stream().map(n-> n.toUpperCase()).toList();

        System.out.println(frutasMaiusculo);
    }
}
