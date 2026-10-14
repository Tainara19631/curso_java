package lista_arrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Atividade_5 {
    public static void main(String[] args) {
        ArrayDeque <String> fila = new ArrayDeque<>();

        fila.addAll(Arrays.asList("Tainara", "Welligton", "Aylin"));

        if(fila.contains("Tainara")){
             System.out.println("Tainara está na lista");
        } 
        else if((fila.contains("Bia"))){
             System.out.println("Bia não está na lista");
        }
    }
}