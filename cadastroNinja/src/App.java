import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro:");
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Lista de ninjas atingiu o valor maximo de 10");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        for (int i = 0; i <= ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos saindo o programa...Aguarde");
                    break;
                default:
                    System.out.println("Esta opcao nao e valida");
                    break;
            }
        }

        sc.close();
    }
}
