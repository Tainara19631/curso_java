package lista_scanner;
import java.util.Scanner;

public class Atividade_1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;
    int idade;

    System.out.println("Digite seu nome: ");
    nome = sc.nextLine();

    System.out.println("Digite sua idade: ");
    idade = sc.nextInt();
    
    System.out.println("Oi " + nome + ", você tem " + idade +  "anos e vai fazer " + (idade + 1) +" no próximo aniversário.");
}
}
