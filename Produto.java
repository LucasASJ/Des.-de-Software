public class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private double preco;

    public Produto(String nome, String codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void atualizarProduto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotalEmEstoque() {
        return quantidade * preco;
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$" + preco);
        System.out.println("Valor total em estoque: R$" + valorTotalEmEstoque());
    }
}