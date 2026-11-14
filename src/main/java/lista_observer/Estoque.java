package lista_observer;
import java.util.ArrayList;
import java.util.List;

public class Estoque {


   private List<ObservadorEstoque> estoque = new ArrayList<>();

   public void adicionarObservador(ObservadorEstoque e){
    estoque.add(e);
   }

   public void setQuantidade(int quantidade){
    
        for(ObservadorEstoque observador: estoque){
            observador.atualizar(quantidade);
        }
   }
}
