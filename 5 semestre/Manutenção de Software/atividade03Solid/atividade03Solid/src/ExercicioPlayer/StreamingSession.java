package ExercicioPlayer;

public class StreamingSession {

    private StreamingPlayer player;

    public StreamingSession (StreamingPlayer player){
        this.player = player;
    }

    public void iniciar(){
        player.reproduzirTitulo();
    }

    public void parar(){
        player.parar();
    }

    public void pausar(){
        player.pausar();
    }
}
