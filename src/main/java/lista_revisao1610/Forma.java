package lista_revisao1610;

public abstract class Forma {
    protected String nome;

    public Forma(String nome){
        this.nome = nome;
    }
    public void exibirNome(){
        System.out.println("Nome da forma: " + nome);
    }
    public abstract double calcularArea();
}
