package lista_hashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_3 {
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList<>(Arrays.asList("Tainara", "Madalena","Jose","Tainara"));

        System.out.println(nomes);

        HashSet <String> nomesSemRepeticao =  new  HashSet<>(nomes);

        System.out.println(nomesSemRepeticao);

    }   
}
