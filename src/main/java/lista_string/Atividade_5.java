package lista_string;
import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String nome2;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu nome de novo: ");
        nome2 = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase("nome2"));

    }
}
