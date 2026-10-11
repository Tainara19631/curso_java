package lista_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_5 {
    public static void main(String[] args) {
         ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Welligton", "Tainara", "Emanuel","Sophia", "Aylin","Pietro"));

         for(int i =0;i <nomes.size(); i++){

            System.out.println(i + ":" + nomes.get(i));

         }
    }
}
