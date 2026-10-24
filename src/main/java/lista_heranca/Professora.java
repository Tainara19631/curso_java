package lista_heranca;

public class Professora extends Pessoa{
    String disciplina;

     @Override
    public void apresentar() {
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }


    public void lancarNota(String aluna, double nota){
        System.out.printf("Flora lançou nota %.1f para %s%n", nota, aluna);
    }

    
}
