package lista_arrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Atividade_4 {
    public static void main(String[] args) {
        ArrayDeque <String> fila = new ArrayDeque<>();

        fila.addAll(Arrays.asList("Tainara", "Welligton", "Aylin"));

         while(!fila.isEmpty()){
            String pessoa = fila.poll();
            System.out.println("Atendendo: " + pessoa);
         }
        System.out.println("Fila vazia" );
    }
}