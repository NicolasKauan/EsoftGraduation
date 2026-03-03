package ExercicioPlayer;

public class StreamingSession {

    private StreamingPlayer player;

    public StreamingSession (StreamingPlayer player){
        player.reproduzirTitulo();
        player.parar();
        player.pausar();

        if(player instanceof IBaixavel){
            ((IBaixavel) player).baixarTitulos();// aqui estamos forçando o java a tratar essa variavel para outro tipo
            //Como não é o tipo padrão, precisamos fazer-lo tratar o player como outro tipo, para utilizar o método
            //BaixarTitulos
        }

        if(player instanceof ICookies){
            System.out.println("Cookies habilitados: "+((ICookies) player).cookiesHabilitados());
        }
    }
}
