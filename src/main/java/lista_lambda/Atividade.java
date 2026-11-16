package lista_lambda;
import java.util.function.Consumer;

public class Atividade {
    public static void main(String[] args) {
        Consumer<String> mostrar = texto -> {
            System.out.println(texto);
        };
         Consumer<String> impressora = texto -> {
            System.out.println(texto.toUpperCase());
        };

         Consumer<String> impressora2 = texto -> {
            System.out.println(texto.toLowerCase());
        };



          mostrar.accept("Olá");
          impressora2.accept("OLà");
          impressora.accept("ola");

          Calculo soma = (a,b) -> a + b;

          System.out.println("Soma: " + soma.calcular(10, 5));

          Calculo mult = (a,b) -> a * b;

          System.out.println("Multiplicação: " + mult.calcular(10,5));

          Calculo maior = (a,b) -> a > b ? a : b;

          System.out.println("Maior: " + maior.calcular(10,20));

        repetir(() -> System.out.println("oi"));

         Operacao dobro = n -> n * 2;

        Operacao quadrado = n -> n * n;

        Operacao negativo = n -> n * -1;

        System.out.print("Dobro: ");
        mostrarResultado(dobro, 10);

        System.out.print("Quadrado: ");
        mostrarResultado(quadrado, 10);

        System.out.print("Negativo: ");
        mostrarResultado(negativo, 10);



    }
     public static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    public static void mostrarResultado(Operacao op, int valor) {
        op.aplicar(valor);
    }
  
}
