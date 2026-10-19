package lista_foreach;

public class Atividade_3 {
    public static void main(String[] args) {
        double[] notas = {8.0,6.0,10.0,7.0};
        double soma = 0;
        double media = 0;
        for(double nota: notas){
            soma = soma + nota;
            media = soma / notas.length;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
