import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar contato");
            System.out.println("2 - Buscar contato por nome");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    Contato contato = new Contato(nome, telefone);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    System.out.print("Nome para busca: ");
                    String busca = scanner.nextLine();
                    agenda.buscarContato(busca);
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