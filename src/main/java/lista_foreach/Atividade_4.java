package lista_foreach;

public class Atividade_4 {
    public static void main(String[] args) {
        String[] nomes = {"Tainara","Aylin"};
        int cont =0;
        
            for(String nome: nomes){
                if(nome.length() > 5){
                    cont++;
                }
            }
        System.out.println(cont);
    }
}
