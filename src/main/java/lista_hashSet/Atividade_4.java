package lista_hashSet;
import java.util.HashSet;
import java.util.Arrays;

public class Atividade_4 {
    public static void main(String[] args) {
        HashSet<String> cpf = new HashSet<>(Arrays.asList("123456","78945","456123"));

        System.out.println(cpf);

        cpf.remove("123456");

        System.out.println(cpf);

        System.out.println(cpf.size());

    }
}
