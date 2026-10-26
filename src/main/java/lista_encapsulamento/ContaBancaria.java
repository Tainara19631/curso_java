package lista_encapsulamento;

public class ContaBancaria {
   private String titular;
   private double saldo;
   private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()) {
            System.out.println("Erro: o titular não pode ser vazio.");
            return;
        }

        this.titular = titular;
    }
    public  void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor Inválido!");
            return;
        }
        saldo+= valor;
        registrarLog("deposito de " + valor);
    }

    public void sacar(double valor){
        if(valor <=0){
            System.out.println("Valor Inválido!");
            return;
        }
        if(!temSaldo(valor)){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo-= valor;
        registrarLog("Saque de "+ valor);
    }

    private boolean temSaldo(double valor){
        return saldo>= valor;
        
    }
     private void registrarLog(String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }
    public String numeroConta(){
        return numeroConta;
    }
}
