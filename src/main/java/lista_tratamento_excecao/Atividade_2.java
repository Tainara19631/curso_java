package lista_tratamento_excecao;
import java.util.Scanner;
public class Atividade_2 {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);

    double[] notas = {8,7,10,9,5};

    System.out.println("Digite uma posição do array: ");

    int posicao = sc.nextInt();

    try {
        System.out.println("Nota escolhida: " + notas[posicao]);
    } catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Posição inválida! O array só vai de 0 a 4.");
    }

        sc.close();
 }

}
