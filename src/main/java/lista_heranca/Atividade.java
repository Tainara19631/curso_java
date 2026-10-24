package lista_heranca;

public class Atividade {
    
    public static void main(String[] args) {
        /*Aluna pessoa = new Aluna();
        Professora professora = new Professora();

     pessoa.nome = "Tainara";
     pessoa.idade = 32;
     pessoa.curso ="Java";

     professora.nome = "Flora";
     professora.idade = 30;
     professora.disciplina = "programação";


    
     

       pessoa.apresentar();
       pessoa.estudar();
       professora.apresentar();
       professora.lancarNota(pessoa.nome, 9.5 );*/


       Diretora diretora = new Diretora();
       Gerente gerente = new Gerente();

       diretora.nome = "Carla";

       diretora.definirMetas("100");
       diretora.aprovarFerias("Ana");
       diretora.baterPonto();

       gerente.nome = "Fabio";
       gerente.baterPonto();
       gerente.aprovarFerias("Tainara");
       gerente.notificar("Tainara");
       gerente.exportar();


    }
}
