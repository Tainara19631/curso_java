package lista_revisao;
import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao= scanner.nextInt();

           switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção: Ver camisas.");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção: Ver calças.");
                    break;
                case 3:
                    System.out.println("Saindo do programa... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
         } while (opcao != 3);
            
          scanner.close();
    }   
}