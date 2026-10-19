package projeto_petshop;

public class Pet {
    
    String nome, especie, porte;
    double peso;
 
   public  String definirPorte(){
        if(peso < 10.0){
            return "Pequeno";
        } else if(peso < 25){
            return "Médio";
        } else{
        return "Grande";
            }
    }
    public  void emitirSom(){
        System.out.println("som");
    }
}
