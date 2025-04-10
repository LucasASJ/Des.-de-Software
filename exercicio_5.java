import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Placa do carro: ");
        String placa = scanner.nextLine();

        Carro carro = new Carro(marca, modelo, ano, placa);

        int opcao;
        do {
            System.out.println("\n1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Exibir informações");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor da aceleração (km/h): ");
                    int acel = scanner.nextInt();
                    carro.acelerar(acel);
                    break;
                case 2:
                    System.out.print("Valor da frenagem (km/h): ");
                    int freio = scanner.nextInt();
                    carro.frear(freio);
                    break;
                case 3:
                    carro.exibirInfo();
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