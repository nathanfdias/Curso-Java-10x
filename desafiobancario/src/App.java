import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.classes.ContaBancaria;
import model.classes.ContaCorrente;
import model.classes.ContaPoupanca;
import model.enums.TipoConta;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente("Kifel", 10000, TipoConta.CORRENTE);
        ContaCorrente cc2 = new ContaCorrente("Nathan", 1000, TipoConta.CORRENTE);
        
        ContaPoupanca cp1 = new ContaPoupanca("Cesar", 20000, TipoConta.POUPANCA);
        ContaPoupanca cp2 = new ContaPoupanca("Breno", 2000, TipoConta.POUPANCA);

        Map<String, ContaCorrente> contasCorrente = new HashMap<>();
        contasCorrente.put("Kifel", cc1);
        contasCorrente.put("Nathan", cc2);

        Map<String, ContaPoupanca> contasPoupanca = new HashMap<>();
        contasPoupanca.put("Cesar", cp1);
        contasPoupanca.put("Breno", cp2);

        // while (true) {
            System.out.println("\n-------Sistema Bancario-------");
            System.out.println("\nClientes disponiveis: ");
            for (Map.Entry<String, ContaCorrente> entry : contasCorrente.entrySet()) {
                System.out.println("- (" + entry.getValue().getNome() + ")");
            }

            for (Map.Entry<String, ContaPoupanca> entry : contasPoupanca.entrySet()) {
                System.out.println("- (" + entry.getValue().getNome() + ")");
            }
        // }

        sc.close();

    }
}
