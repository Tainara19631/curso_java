package lista_hashMap;
import java.util.HashMap;
import java.util.Map;

public class Atividade_5 {
    public static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap<>(Map.of("Amora",5.6,"Ana", 10.0,
                "Joana", 7.5
));

        
            System.out.println(notas);
        
            System.out.println(notas.size());

            notas.remove("Ana");

            System.out.println(notas);
        

    }
}