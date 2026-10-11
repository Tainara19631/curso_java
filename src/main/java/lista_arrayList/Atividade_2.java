package lista_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_2 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Goiaba", "Manga"));

        System.out.println(frutas.get(0));

        System.out.println(frutas.get(3));

        System.out.println(frutas.size());

    }
    
}
