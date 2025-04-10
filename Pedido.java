public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private String endereco;

    public Pedido(Pizza pizza, String tamanho, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public double getValor() {
        return pizza.getValor();
    }

    public void exibirPedido() {
        System.out.println("Pizza: " + pizza.getNome());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: R$" + pizza.getValor());
    }
}