import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.classes.ContaCorrente;
import model.classes.ContaPoupanca;
import model.enums.TipoConta;
import model.interfaces.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente("kifel", 10000, TipoConta.CORRENTE);
        ContaCorrente cc2 = new ContaCorrente("nathan", 1000, TipoConta.CORRENTE);

        ContaPoupanca cp1 = new ContaPoupanca("cesar", 20000, TipoConta.POUPANCA);
        ContaPoupanca cp2 = new ContaPoupanca("breno", 2000, TipoConta.POUPANCA);

        Map<String, ContaCorrente> contasCorrente = new HashMap<>();
        contasCorrente.put("kifel", cc1);
        contasCorrente.put("nathan", cc2);

        Map<String, ContaPoupanca> contasPoupanca = new HashMap<>();
        contasPoupanca.put("cesar", cp1);
        contasPoupanca.put("breno", cp2);

        while (true) {
            System.out.println("\n-------Sistema Bancario-------");
            System.out.println("\nClientes disponiveis: ");

            for (Map.Entry<String, ContaCorrente> entry : contasCorrente.entrySet()) {
                System.out.println("- " + entry.getValue().getNome());
            }
            for (Map.Entry<String, ContaPoupanca> entry : contasPoupanca.entrySet()) {
                System.out.println("- " + entry.getValue().getNome());
            }

            System.out.println("Escolha o cliente (ou 'sair'): ");
            String nomeDigitado = sc.nextLine().toLowerCase();

            if (nomeDigitado.equals("sair")) {
                break;
            }

            ContaCorrente cc = contasCorrente.get(nomeDigitado);
            ContaPoupanca cp = contasPoupanca.get(nomeDigitado);

            if (cc == null && cp == null) {
                System.out.println(" Cliente não encontrado.");
                continue;
            }

            if (cc != null) {
                System.out.println("\n Bem vindo, " + cc.getNome());
                menuOperacoes(sc, cc);
            } else {
                System.out.println("\n Bem vindo, " + cp.getNome());
                menuOperacoes(sc, cp);
            }
        }

        sc.close();
    }

    private static void menuOperacoes(Scanner sc, Conta conta) {
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Consultar saldo");
        System.out.println("3 - Retornar");
        System.out.print("Opção: ");

        int opcao;
        try {
            opcao = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(" Opção inválida.");
            return;
        }

        switch (opcao) {
            case 1 -> {
                System.out.print("Digite o valor a depositar: ");
                double valor = Double.parseDouble(sc.nextLine());
                if (valor <= 0) {
                    System.out.println(" Valor inválido.");
                    return;
                }
                conta.Depositar(valor);
            }
            case 2 -> conta.ConsultarSaldo();
            case 3 -> System.out.println(" Retornando.");
            default -> System.out.println(" Opção inválida.");
        }
    }
}