package lista_interface;

public class Carro implements Veiculo{
    @Override 
    public void ligar(){
        System.out.println("Ligar");
    }

    public void acelerar(){
        System.out.println("Acelerar");
    }

}
