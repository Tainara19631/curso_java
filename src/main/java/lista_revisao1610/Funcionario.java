package lista_revisao1610;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public void setNome(String nome){
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro: o nome não pode ser vazio.");
            return;
        }

        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase){
        if (salarioBase < 0) {
            System.out.println("Erro: O salário base não pode ser negativo.");
            return;
        }

        this.salarioBase = salarioBase;
    }
    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public abstract double calcularSalario();

    

}
