package lista_revisao;
import java.util.Scanner;
public class Atividade_5 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        for(int i = 0; i< 3; i++){
            System.out.println("--- Produto " + i + " ---");

            System.out.println("Digite o produto:");
            produto.nome = scanner.nextLine();

            System.out.println("Digite o preço:");
            produto.preco = scanner.nextDouble();

            scanner.nextLine(); 

            if(produto.preco > 100){
                System.out.printf("Produto caro: R$ %.2f\n" , produto.preco);
            }
            else{
                System.out.printf("Produto com preço acessível: R$ %.2f\n " , produto.preco);
            }
        }

        scanner.close();
     }
}
