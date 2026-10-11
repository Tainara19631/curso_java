package lista_tratamento_excecao;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

         
        try{
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Idade: " + idade);
        } catch(InputMismatchException e){
           System.out.println("Erro! Digite uma idade usando números inteiros.");
        }
        sc.close();
    }

}
