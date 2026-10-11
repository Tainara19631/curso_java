package lista_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Welligton", "Tainara", "Emanuel","Sophia"));

        System.out.println(nomes);

       nomes.set(0, "Aylin");

        System.out.println(nomes);


    }
}
