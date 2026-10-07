package lista_string;
import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        String palavra;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        System.out.println("Digite uma palvra: ");
        palavra = sc.nextLine();

        System.out.println("A frase contem a palavra java? " + frase.contains(palavra));

    }
}
