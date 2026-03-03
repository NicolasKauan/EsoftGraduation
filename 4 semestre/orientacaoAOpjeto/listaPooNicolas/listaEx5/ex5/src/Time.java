import java.util.ArrayList;

public class Time {
    private String nome;
    private String cidade;
    private ArrayList<Jogador> jogadores;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void adicionarJogador(Jogador jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
            jogador.setTime(this); // o jogador agora pertence a este time
        }
    }

    public void listarJogadores() {
        System.out.println("Time " + nome + " (" + cidade + "):");
        for (Jogador j : jogadores) {
            System.out.println(" - " + j.getNome() + " (" + j.getPosicao() + ")");
        }
    }
}
