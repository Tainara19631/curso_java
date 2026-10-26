package lista_encapsulamento;

public class Atividade {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        Produto produto = new Produto();
        
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());

         c.setTitular("");
        System.out.println("Titular: " + c.getTitular());

        c.setTitular("Ana");
        System.out.println("Titular: " + c.getTitular());

        System.out.println("Numero da Conta: " +c.numeroConta());

        c.depositar(500);
        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);

        //System.out.println("Codigo: " + produto.codigoInterno);
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preco: " + produto.preco);

        
        
    }

}
