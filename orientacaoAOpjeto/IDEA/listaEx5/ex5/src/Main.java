public class Main {
    public static void main(String[] args) {
        Time time1 = new Time("Palmeiras", "São Paulo");
        Time time2 = new Time("Flamengo", "Rio de Janeiro");

        Jogador j1 = new Jogador("Nicolas", "Atacante");
        Jogador j2 = new Jogador("Matheus", "Goleiro");
        Jogador j3 = new Jogador("Eduardo", "Zagueiro");

        // Jogadores sendo contratados
        time1.adicionarJogador(j1);
        time1.adicionarJogador(j2);
        time2.adicionarJogador(j3);

        // Listar jogadores dos times
        time1.listarJogadores();
        time2.listarJogadores();

        // Jogador sem time
        Jogador j4 = new Jogador("Pedro", "Meia");
        System.out.println(j4);
    }
}
