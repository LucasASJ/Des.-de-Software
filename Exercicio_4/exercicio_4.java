package Exercicio_4;
import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do jogador: ");
        String nome = scanner.nextLine();

        System.out.print("Pontuação inicial: ");
        int pontuacao = scanner.nextInt();

        System.out.print("Nível inicial: ");
        int nivel = scanner.nextInt();

        Jogador jogador = new Jogador(nome, pontuacao, nivel);

        int opcao;
        do {
            System.out.println("\n1 - Aumentar pontuação");
            System.out.println("2 - Subir de nível");
            System.out.println("3 - Exibir informações");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para aumentar: ");
                    int valor = scanner.nextInt();
                    jogador.aumentarPontuacao(valor);
                    break;
                case 2:
                    jogador.subirNivel();
                    break;
                case 3:
                    jogador.exibirInfo();
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