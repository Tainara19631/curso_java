package lista_factory_adapter_facade;

public class Atividade {
    public static void main(String[] args) {
        AnimalFactory fabrica = new AnimalFactory();

        Animal cachorro = fabrica.getAnimal("cachorro");
        Animal gato = fabrica.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

        Pagamento pagamento = new PayPalAdapter(new PayPalAPI());

        pagamento.pagar();

        ManhaFacade manha = new ManhaFacade();

        manha.acordar();
    }
}
