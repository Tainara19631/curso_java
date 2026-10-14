package lista_arrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Atividade_2 {
    public static void main(String[] args) {
        ArrayDeque <String> fila = new ArrayDeque<>();

        fila.addAll(Arrays.asList("Tainara", "Welligton", "Aylin"));

        System.out.println("Próxima pessoa: " + fila.peek());
        System.out.println("Fila: " + fila);

    }
}
