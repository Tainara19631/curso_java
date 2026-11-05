package lista_factory_adapter_facade;

public class AnimalFactory {

    public Animal getAnimal(String tipo){
        if(tipo.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        }
        else if(tipo.equalsIgnoreCase("gato")){
            return new Gato();
        }

          throw new IllegalArgumentException("Animal não encontrado!");
    }
}
