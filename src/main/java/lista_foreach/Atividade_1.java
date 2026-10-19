package lista_foreach;

public class Atividade_1 {
    public static void main(String[] args) {
        String[] nomes = {"Tainara","Madalena","Paulo","Emanuel"};

        for(String nome : nomes){
            System.out.println(nome);
        }
        for(int i = 0; i < nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
    
}
