package projeto_petshop;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.InputMismatchException;

public class Petshop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //Pet pet = new Pet();
        int opcao=-1;
        ArrayList<Pet> lista = new ArrayList<>();
        HashSet<String> especies = new HashSet<>();
        ArrayDeque<String> fila = new ArrayDeque<>();

        
        
            while(opcao != 0){
                System.out.println("=== PETSHOP ===");
                System.out.println("1 - Cadastrar pet");
                System.out.println("2 - Listar pets");
                System.out.println("3 - Buscar pet");
                System.out.println("4 - Consultar espécies cadastradas");
                System.out.println("5 - Entrar na fila de banho");
                System.out.println("6 - Atender o próximo");
                System.out.println("7 - Executar serviços");
                System.out.println("0 - Sair");
            try{
                opcao = sc.nextInt();

                sc.nextLine();

                switch (opcao) {
                    case 1:
                       System.out.println("Digite o nome do animal: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite a espécie do animal: ");
                        String especie = sc.nextLine();

                        Pet pet;

                        if (especie.equalsIgnoreCase("cachorro")) {
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }

                        pet.nome = nome;
                        pet.especie = especie;

                        System.out.println("Digite o peso do animal: ");
                        pet.peso = sc.nextDouble();
                        sc.nextLine();

                        pet.porte = pet.definirPorte();

                        lista.add(pet);

                        System.out.println("Pet cadastrado com sucesso!");

                        break; 

                    case 2:

                         if (lista.isEmpty()) {
                        System.out.println("Nenhum pet cadastrado.");
                        } else {
                            for (int i = 0; i < lista.size(); i++) {
                                mostrarPet(lista.get(i));

                                mostrarPet(lista.get(i), "=== FICHA DO PET ===");

                                lista.get(i).emitirSom();
                            }
                        }
                        break;
                                    case 3:
                        String nomes; 
                        System.out.println("Qual pet você procura");
                        nomes = sc.nextLine();
                        boolean achou = false;
                    
                        for(int i = 0; i < lista.size(); i++){
                            if(lista.get(i).nome.equalsIgnoreCase(nomes)){
                                System.out.println("Encontrado");
                                System.out.println("Nome: " + lista.get(i).nome);
                                System.out.println("Espécie: " + lista.get(i).especie);
                                System.out.printf("Peso: %.1f Kg%n", lista.get(i).peso);
                                System.out.println("Porte: " + lista.get(i).porte );
                                
                                achou = true;

                                break;
                            }

                            }
                            if (!achou) {
                            System.out.println("Não encontrado.");
                            }

                            break;
                    case 4:
                        if(lista.isEmpty()) {
                                System.out.println("Nenhum espécie cadastrada.");
                        } else{
                                especies.clear();

                                for(int i = 0; i < lista.size(); i++){
                                    especies.add(lista.get(i).especie);
                                }
                                System.out.println("---ESPÉCIES CADASTRADOS--");
                                for(String especieme: especies){
                                    System.out.println("- "+ especieme);
                                }
                                    System.out.println("Total de espécies diferentes: " + especies.size());
                        }
                            break;
                    case 5:
                        String nomeFila;
                        System.out.println("Nome do pet pra entrar na fila:");
                        nomeFila = sc.nextLine();
                        boolean achou2 = false;

                        for(int i = 0; i < lista.size(); i++){
                            if(lista.get(i).nome.equalsIgnoreCase(nomeFila)){
                                fila.add(nomeFila);
                                achou2 = true;
                                System.out.println(nomeFila + " entrou na fila.");
                                System.out.println("Fila agora: " + fila);

                                break;
                            }

                            }
                            if (!achou2) {
                            System.out.println("Pet não cadastrado. Cadastre o pet primeiro");
                            }


                            break;
                    case 6:
                        if (fila.isEmpty()) {
                            System.out.println("Não há pets na fila de banho.");
                        } else {
                            String proximo = fila.poll();

                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + fila);
                        }
                        break;
                    case 7: {
                            System.out.println("Nome do pet:");
                            String nomePet = sc.nextLine();

                            ArrayList<Servico> servicos = new ArrayList<>();

                            servicos.add(new Banho());
                            servicos.add(new Tosa());
                            servicos.add(new Consulta());

                            for (Servico servico : servicos) {
                                servico.executar(nomePet);
                            }

                            break;
                        }
                    case 0:
                        System.out.println("Obrigada por usar o sistema.");
                        
                        break;
                    default:
                        System.out.println("Opção Inválida.");
                        break;
                }


            }catch(InputMismatchException e){
                System.out.println("Opção inválida! Digite um número.");
                sc.nextLine();
        }

    }

        
        System.out.println("Total Cadastrado: " + lista.size());
 
        sc.close();
    }
    public static void mostrarPet(Pet pet) {
    System.out.println("Nome: " + pet.nome);
}

public static void mostrarPet(Pet pet, String titulo) {
    System.out.println("===");
    System.out.println(titulo);
    System.out.println("Nome: " + pet.nome);
    System.out.println("Espécie: " + pet.especie);
    System.out.printf("Peso: %.1f kg%n", pet.peso);
    System.out.println("Porte: " + pet.porte);
}

}
