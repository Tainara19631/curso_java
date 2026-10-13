package lista_hashSet;
import java.util.HashSet;
import java.util.Arrays;

public class Atividade_5 {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<> (Arrays.asList("Banana", "Manga", "Maçã"));

        for(String fruta: frutas){
            System.out.println(fruta);
        }

    }
}
