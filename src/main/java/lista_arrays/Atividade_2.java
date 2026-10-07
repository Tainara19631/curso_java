package lista_arrays;

public class Atividade_2 {
    public static void main(String[] args) {
        int[] notas= {8, 6, 10, 7, 9};
        int  cont = 0;

        for(int i =0; i < notas.length; i++){
            cont++;
            System.out.println("Nota " + cont + ": " + notas[i]);
        }
    }
}
