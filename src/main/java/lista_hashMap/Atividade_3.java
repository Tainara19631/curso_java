package lista_hashMap;
import java.util.HashMap;
import java.util.Map;

public class Atividade_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> agenda = new HashMap<>(Map.of("Tai",12335,"Ju", 3333
              
));

        if(agenda.containsKey("Tai")){
            System.out.println(agenda.get("Tai"));
        } else{
            System.out.println(agenda.get("Ju"));
        }

    }
}

