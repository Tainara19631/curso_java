package lista_tratamento_excecao;
import java.util.Scanner;
public class Atividade_1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    double div = 0;
    System.out.println("Digite o primeiro numero:");
    num1 = sc.nextInt();

    System.out.println("Digite o segundo numero:");
    num2 = sc.nextInt();

    try{
        div = num1 / num2;

    System.out.println("Divisão: " + div);
    } catch(ArithmeticException e){
        System.out.println("Erro: não é possível dividir por zero!");
    }
 
    

    sc.close();

 }
}
