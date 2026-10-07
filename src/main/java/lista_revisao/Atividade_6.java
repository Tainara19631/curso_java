package lista_revisao;

import java.util.Scanner;

public class Atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Digite seu ano de nascimento: ");
        usuario.anoNascimento = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome completo: ");
        usuario.nomeCompleto = sc.nextLine();

        System.out.println("O usuário " + usuario.nomeCompleto + " nasceu em " + usuario.anoNascimento + ".");
        
        sc.close();
    }

}
