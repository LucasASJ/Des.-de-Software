package Exercicio_8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pizza> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        cardapio.add(new Pizza("Calabresa", 30.0, Arrays.asList("calabresa", "cebola", "mussarela")));
        cardapio.add(new Pizza("Frango com Catupiry", 35.0, Arrays.asList("frango", "catupiry", "mussarela")));
        cardapio.add(new Pizza("Margherita", 32.0, Arrays.asList("tomate", "manjericão", "mussarela")));
        cardapio.add(new Pizza("Quatro Queijos", 38.0, Arrays.asList("mussarela", "gorgonzola", "provolone", "parmesão")));

        int opcao;
        do {
            System.out.println("\n1 - Ver cardápio");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Cancelar pedido");
            System.out.println("4 - Ver pedidos");
            System.out.println("5 - Relatório");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println("\n[" + i + "]");
                        cardapio.get(i).exibirPizza();
                    }
                    break;
                case 2:
                    System.out.print("Digite o número da pizza: ");
                    int numPizza = scanner.nextInt();
                    scanner.nextLine();
                    if (numPizza >= 0 && numPizza < cardapio.size()) {
                        System.out.print("Tamanho (P/M/G): ");
                        String tamanho = scanner.nextLine();
                        System.out.print("Endereço de entrega: ");
                        String endereco = scanner.nextLine();
                        Pedido novoPedido = new Pedido(cardapio.get(numPizza), tamanho, endereco);
                        pedidos.add(novoPedido);
                        System.out.println("Pedido adicionado.");
                    } else {
                        System.out.println("Pizza inválida.");
                    }
                    break;
                case 3:
                    System.out.print("Número do pedido para cancelar: ");
                    int numCancelar = scanner.nextInt();
                    scanner.nextLine();
                    if (numCancelar >= 0 && numCancelar < pedidos.size()) {
                        pedidos.remove(numCancelar);
                        System.out.println("Pedido cancelado.");
                    } else {
                        System.out.println("Pedido não encontrado.");
                    }
                    break;
                case 4:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido realizado.");
                    } else {
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println("\nPedido [" + i + "]");
                            pedidos.get(i).exibirPedido();
                        }
                    }
                    break;
                case 5:
                    double soma = 0;
                    for (Pedido p : pedidos) {
                        soma += p.getValor();
                    }
                    System.out.println("Total de pedidos: " + pedidos.size());
                    if (!pedidos.isEmpty()) {
                        System.out.println("Média de preço dos pedidos: R$" + (soma / pedidos.size()));
                    }
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