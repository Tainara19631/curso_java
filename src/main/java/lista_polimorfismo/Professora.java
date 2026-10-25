package lista_polimorfismo;

public class Professora extends Pessoa{
    String disciplina;

    public void lancarNota(String professora, double nota, String aluna){
        System.out.printf("%s lançou nota %.1f para %s%n",professora, nota, aluna);
    }
}
