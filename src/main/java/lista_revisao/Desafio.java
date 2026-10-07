package lista_revisao;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cadastro_Alunas aluna = new Cadastro_Alunas();

        aluna.cont = 0;

        while(aluna.opcao != 3){

            System.out.println("1 - Cadastrar aluna");
            System.out.println("2 - Mostrar alunas cadastradas");
            System.out.println("3 - Sair");

            aluna.opcao = sc.nextInt();

            switch (aluna.opcao) {
                case 1:

                    System.out.println("Digite a primeira nota: ");
                    aluna.nota1 = sc.nextDouble();

                    while (aluna.nota1 < 0 || aluna.nota1 > 10) {
                    System.out.println("Nota invalida. Digite uma nota entre 0 e 10: ");
                    aluna.nota1 = sc.nextDouble();
                }

                    System.out.println("Digite a segunda nota: ");
                    aluna.nota2 = sc.nextDouble();

                    while (aluna.nota2 < 0 || aluna.nota2 > 10) {
                    System.out.println("Nota invalida. Digite uma nota entre 0 e 10: ");
                    aluna.nota2 = sc.nextDouble();
                }

                    sc.nextLine();

                    System.out.println("Digite seu nome: ");
                    aluna.nome = sc.nextLine();

                    aluna.media = ((aluna.nota1 + aluna.nota2) / 2);

                    if( aluna.media >= 6){
                        aluna.passou = true;
                         System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f,%ne sua média final foi %.1f. Aluna aprovada: %b%n",aluna.nome, aluna.nota1, aluna.nota2, aluna.media, aluna.passou);
                    }
                    else{
                        aluna.passou = false;
                        System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f,%ne sua média final foi %.1f. Aluna Reprovada: %b%n",aluna.nome, aluna.nota1, aluna.nota2, aluna.media, aluna.passou);
                    }

                    aluna.cont++;
                    
                    break;
                
            case 2:{
                System.out.println("Alunas cadastradas: " + aluna.cont);
                break;
            }

            case 3:{
                System.out.println("Encerrando o sistema. Até logo!");
                break;
            }
             
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
        sc.close();
    }

}
