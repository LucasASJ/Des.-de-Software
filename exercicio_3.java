import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de conta bancária:");
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);
        conta.exibirInfo();

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double valorDep = scanner.nextDouble();
                    conta.depositar(valorDep);
                    break;
                case 2:
                    System.out.print("Valor para sacar: ");
                    double valorSaq = scanner.nextDouble();
                    conta.sacar(valorSaq);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}