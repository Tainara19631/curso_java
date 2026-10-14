package lista_arrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Atividade_3 {
    public static void main(String[] args) {
        ArrayDeque <String> fila = new ArrayDeque<>();

        fila.addAll(Arrays.asList("Tainara", "Welligton", "Aylin"));

         fila.poll();
        System.out.println("Fila: " + fila);
    }
}
