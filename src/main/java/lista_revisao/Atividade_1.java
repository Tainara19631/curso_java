package lista_revisao;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        String lanche = scanner.nextLine();

        System.out.println("Digite o valor do lanche:");
        double valor = scanner.nextDouble();

        if(valor > 30.0){
         valor = valor - 5.00;
         
        }

        System.out.printf("O lanche " + lanche + " custa R$ %.2f", valor + " reais.");

        scanner.close();

    }
}
