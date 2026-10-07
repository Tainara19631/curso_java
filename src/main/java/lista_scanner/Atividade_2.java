package lista_scanner;
import java.util.Scanner;

public class Atividade_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    int soma= 0;
    int sub = 0;
    int mult = 0;
    double div = 0;

    System.out.println("Digite um número: ");
    num1 = sc.nextInt();

    System.out.println("Digite um número: ");
    num2 = sc.nextInt();

    soma = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = (double) num1 / num2;

    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + sub);
    System.out.println("Multiplicação: " + mult);
    System.out.println("Divisão: " + div);

    sc.close();
}
}
