package lista_hashMap;
import java.util.HashMap;
import java.util.Map;

public class Atividade_2 {
    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>(Map.of("cafe",5.00,"leite", 4.50,
                "arroz", 25.90
));

        System.out.println(produtos);

        produtos.put("cafe", 7.50);

        System.out.println(produtos);
        System.out.println(produtos.size());

    }
}
