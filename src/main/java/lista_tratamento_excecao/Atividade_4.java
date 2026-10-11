package lista_tratamento_excecao;
public class Atividade_4 {
    public static void main(String[] args) {
        

        try{
            String nome = null;
            System.out.println(nome.length());
        }catch(NullPointerException e){
            System.out.println("Nome invalido");
        }
    }
}
