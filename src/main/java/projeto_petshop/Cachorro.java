package projeto_petshop;

public class Cachorro extends Pet {

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au au!");
    }
}