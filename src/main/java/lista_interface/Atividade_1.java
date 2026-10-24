package lista_interface;
import java.util.ArrayList;

public class Atividade_1 {
    public static void main(String[] args) {

        /*Animal bidu = new Cachorro();
        bidu.emitirSom();

        Animal salem= new Gato();
        salem.emitirSom(); */
        /*ArrayList<Animal> animais= new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal: animais){
            animal.emitirSom();
        } */

        /*ArrayList<Notificacao> notificacoes= new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao: notificacoes){
            notificacao.enviar("Sua compra foi aprovada!");
        } */

        ArrayList<Veiculo> veiculos= new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo: veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }


    }
}
