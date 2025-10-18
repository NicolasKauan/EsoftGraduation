import java.util.ArrayList;
import java.util.List;

public class Time {
    private List<Jogador> jogadores;

    public Time() {
        this.jogadores = new ArrayList<>();
    }

    public void contratarJogador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador " + jogador.getNome() + " contratado para a posição " + jogador.getPosicao());
    }

    public void exibirEscalacao() {
        if (jogadores.isEmpty()) {
            System.out.println("Nenhum jogador contratado ainda.");
        } else {
            System.out.println("Escalação do time:");
            for (Jogador jogador : jogadores) {
                System.out.println(jogador);
            }
        }
    }
}
