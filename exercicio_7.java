import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Atualizar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Exibir estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    estoque.add(new Produto(nome, codigo, quantidade, preco));
                    break;
                case 2:
                    System.out.print("Código do produto a atualizar: ");
                    String codigoAtualizar = scanner.nextLine();
                    boolean encontradoAtualizar = false;
                    for (Produto p : estoque) {
                        if (p.getCodigo().equalsIgnoreCase(codigoAtualizar)) {
                            System.out.print("Novo nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Nova quantidade: ");
                            int novaQtd = scanner.nextInt();
                            System.out.print("Novo preço: ");
                            double novoPreco = scanner.nextDouble();
                            scanner.nextLine();
                            p.atualizarProduto(novoNome, novaQtd, novoPreco);
                            encontradoAtualizar = true;
                            break;
                        }
                    }
                    if (!encontradoAtualizar) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Código do produto a remover: ");
                    String codigoRemover = scanner.nextLine();
                    boolean removido = estoque.removeIf(p -> p.getCodigo().equalsIgnoreCase(codigoRemover));
                    if (removido) {
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        for (Produto p : estoque) {
                            System.out.println("------------------------");
                            p.exibirProduto();
                        }
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