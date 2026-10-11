package lista_tratamento_excecao;
import java.util.Scanner;
public class Atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        try{
            
            System.out.println("Digite um numero");
           int num = sc.nextInt();
           int resto = 100 % num;
            System.out.println("Resto: " + resto);

        } catch(ArithmeticException e){
            System.out.println("Digite um numero maior que zero");
        }
        sc.close();
    }

}
