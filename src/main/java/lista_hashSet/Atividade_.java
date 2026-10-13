package lista_hashSet;
import java.util.HashSet;
import java.util.Arrays;

public class Atividade_ {
    public static void main(String[] args) {
        HashSet <String> cores = new HashSet<>();
        cores.addAll( Arrays.asList("azul","verde","vermelho"));

        if(cores.contains("verde")){
            System.out.println("Está no conjunto.");
        } else{
            System.out.println("Não está no conjunto");
        }

    }
}
