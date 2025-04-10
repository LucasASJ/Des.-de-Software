import java.util.Scanner;


class Livro {
    
    String titulo;
    String autor;
    int ano;

    
    Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    
    void exibirInfo() {
        System.out.println("----- Informações do Livro -----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + ano);
    }
}

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Cadastre um livro na sua biblioteca:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano de publicação: ");
        int ano = scanner.nextInt();

        
        Livro meuLivro = new Livro(titulo, autor, ano);

        
        meuLivro.exibirInfo();

        scanner.close();
    }
}