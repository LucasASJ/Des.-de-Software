package Exercicio_4;
public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int valor) {
        if (valor > 0) {
            pontuacao += valor;
        }
    }

    public void subirNivel() {
        nivel++;
    }

    public void exibirInfo() {
        System.out.println("----- Perfil do Jogador -----");
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}