package lista_revisao;

public class Atividade_4 {
    public static void main(String[] args) {
        Pet cachorro = new Pet();
        cachorro.nome = "Celahena";
        cachorro.raca ="Pitbull";
        cachorro.peso = 40;

        Pet gato = new Pet();
        gato.nome = "Pandora";
        gato.raca = "Viralata";
        gato.peso = 10;

        System.out.println("Minha cachorra chama " + cachorro.nome + " e da raça " + cachorro.raca + " e tem " + cachorro.peso + " quilos.");
        System.out.println("Minha gata chama " + gato.nome + " e da raça " + gato.raca + " e tem " + gato.peso + " quilos.");
    }
}
