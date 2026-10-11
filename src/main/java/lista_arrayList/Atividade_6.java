package lista_arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Welligton", "Tainara", "Emanuel","Sophia", "Aylin"));

         System.out.println("Digite um nome: ");

         String nome = sc.nextLine();

         System.out.println("O nome esta na lista?" + nomes.contains(nome));

         if(nomes.contains(nome) == true){
            System.out.println("Esta na posição " + nomes.indexOf(nome));
         } else{
            System.out.println("O nome informado não está na lista");
         }

         sc.close();
    }
}
