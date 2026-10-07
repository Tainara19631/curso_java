package lista_string;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCompleto;

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();

        System.out.println("Seu nome tem " + nomeCompleto.length() + " letras.");

    }
}
