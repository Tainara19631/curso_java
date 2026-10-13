package lista_hashMap;
import java.util.HashMap;


public class Atividade_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> dados = new HashMap<>();
        dados.put("Tainara", 32);
        dados.put("Welligton", 30);
        dados.put("Aylin", 0);

        System.out.println(dados);

        System.out.println(dados.get("Tainara"));
    
    
    }
}
