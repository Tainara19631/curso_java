package lista_stream;
import java.util.List;
public class Atividade3 {
    public static void main(String[] args) {
        List<String> cidades = List.of("Esmeraldas", "Sabara", "Contagem");
        long  cidadesComecamS = cidades.stream().filter(cidade -> cidade.startsWith("S")).count();

        System.out.println(cidadesComecamS);
    }
    }
