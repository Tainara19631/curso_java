package lista_arrays;

public class Atividade_3 {
    public static void main(String[] args) {
        int[] notas= {8, 6, 10, 7, 9};
        int soma = 0;
        double media = 0;

        for(int i =0; i < notas.length; i++){
            soma = soma + notas[i];
          
        }
        media = soma / notas.length;
          System.out.println("A soma das notas: " + soma);
          System.out.println("A media das notas: " + media);
    }
}