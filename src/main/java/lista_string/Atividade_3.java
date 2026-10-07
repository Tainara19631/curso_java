package lista_string;
import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("A primeira letra do seu nome e:  " + nome.charAt(0) + ".");

        sc.close();
    }
}