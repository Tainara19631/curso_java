package lista_arrayDeque;
import java.util.ArrayDeque;

public class Atividade_6 {
    public static void main(String[] args) {
        ArrayDeque<String> fila= new ArrayDeque<>();
        
        if(!fila.isEmpty()){
            System.out.println("Proximo" + fila.peek());
        }
        else{
           System.out.println("Não tem ninguém na fila."); 
        }

        fila.add("Amora");

        if(!fila.isEmpty()){
            System.out.println("Proximo " + fila.peek());
        }
        else{
           System.out.println("Não tem ninguém na fila."); 
        }
    }
}
