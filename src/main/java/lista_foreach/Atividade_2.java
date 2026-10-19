package lista_foreach;
import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(10.0,9.0,8.0,7.0,6.0));
        for(double nota: notas){
            System.out.println("Notas: " + nota);
        }
    }
}
