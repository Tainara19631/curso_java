package lista_string;
import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Seu nome maiusculo " + nome.toUpperCase()+ ".");
        System.out.println("Seu nome maiusculo " + nome.toLowerCase()+ ".");

        sc.close();
    }
}