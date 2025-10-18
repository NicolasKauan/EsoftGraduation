public class Jogador {
    private String nome;
    private String posicao;
    private Time time; // pode ser null (sem time)

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
        this.time = null;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return nome + " (" + posicao + ")" + (time != null ? " - Time: " + time.getNome() : " - Sem time");
    }
}
