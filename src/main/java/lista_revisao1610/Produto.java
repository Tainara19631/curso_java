package lista_revisao1610;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String  getNome(){
        return nome;
    }
    public double  getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void  setNome(String nome){
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro: o nome não pode ser vazio.");
            return;
        }

        this.nome = nome;
       

    }
    public void  setPreco(double preco){
        if(preco <= 0){
             System.out.println("Erro: preço inválido.");
            return;
        }
        this.preco = preco;

    }
    public void setQuantidade(int quantidade){
        if(quantidade < 0){
             System.out.println("Erro:quantidade inválida.");
            return;
        }
        this.quantidade = quantidade;
    }

}
