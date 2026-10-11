package lista_tratamento_excecao;

public class Atividade_6 {
    public static void main(String[] args) {
       

        try{
             String[] nomes = {"Tainara, Welligton, Aylin"};
             System.out.println(nomes[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe");
        
        }
        System.out.println("O programa continua funcionando");

    }
    
}
