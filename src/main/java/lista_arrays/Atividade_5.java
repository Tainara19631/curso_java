package lista_arrays;
import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for(int i =0; i < numeros.length; i++){
            System.out.println("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        for(int j = numeros.length -1 ; j >= 0; j--){
            System.out.println(numeros[j]);

        }
    }

}
