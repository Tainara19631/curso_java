package lista_factory_adapter_facade;

public class ManhaFacade {
    private Despertador despertador = new Despertador();
    private Cafeteira cafe = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();


    public void acordar(){
        despertador.desligar();
        cafe.fazerCafe();
        chuveiro.ligar();

    }
}
