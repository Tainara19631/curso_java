package lista_arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_4 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>(Arrays.asList("Belo Horizonte","Ribeirão das Neves","Esmeraldas","Raposos"));

        cidades.remove(1);

        System.out.println(cidades.size());
    }

}
