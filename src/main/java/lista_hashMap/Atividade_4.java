package lista_hashMap;
import java.util.HashMap;
import java.util.Map;

public class Atividade_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> produtos = new HashMap<>(Map.of("cafe",5,"leite", 4,
                "arroz", 25
));

        
            System.out.println(produtos.getOrDefault("cafe",0));
        
            System.out.println(produtos.getOrDefault("agua",0));

            System.out.println(produtos.get("agua"));
        

    }
}
