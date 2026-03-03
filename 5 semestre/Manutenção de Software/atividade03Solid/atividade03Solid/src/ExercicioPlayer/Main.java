package ExercicioPlayer;

public class Main {
    public static void main(String[] args) {
        StreamingPlayer player = new MobilePlayer();
        StreamingPlayer player1 = new BrowserPlayer();
        StreamingPlayer player2 = new SmartTVPlayer();

        StreamingSession streamingSession = new StreamingSession(player);
        StreamingSession streamingSession1 = new StreamingSession(player1);
        StreamingSession streamingSession2 = new StreamingSession(player2);




    }
}
