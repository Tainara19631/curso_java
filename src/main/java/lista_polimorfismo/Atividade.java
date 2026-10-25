package lista_polimorfismo;

public class Atividade {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcularArea( 4.0));
        System.out.println(calculadora.calcularArea(4.0, 5.0));
        System.out.println(calculadora.calcularArea(4));

        Painel painel = new Painel();
        painel.exibir("Olá!");
        painel.exibir(10);
        painel.exibir(true);
        painel.exibir(5.7);

        
        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Aluna aluna = new Aluna();
        aluna.nome = "Tainara";
        aluna.idade = 32;
        aluna.curso ="Java";

        Pessoa pessoa = new Estagiaria();

        pessoa.apresentar();

        professora.lancarNota(professora.nome, 9.5, aluna.nome );
        aluna.estudar();

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Ana";
        estagiaria.idade = 22;

        mostrarFicha(aluna);
        mostrarFicha(professora);
        mostrarFicha(estagiaria);

    }   

     static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    
}
