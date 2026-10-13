package lista_hashSet;
import java.util.HashSet;

public class Atividade_1 {
    public static void main(String[] args) {
        HashSet <String> nomes = new HashSet<>();

        nomes.add("Tainara");
        nomes.add("Welligton");
        nomes.add("Aylin");
        nomes.add("Tainara");

        System.out.println(nomes);

        System.out.println(nomes.size());
    }
}
