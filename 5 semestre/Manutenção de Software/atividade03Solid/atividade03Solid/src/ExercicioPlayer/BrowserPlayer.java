package ExercicioPlayer;

public class BrowserPlayer implements StreamingPlayer,ICookies{

    @Override
    public void reproduzirTitulo() {
        System.out.println("Browser Reproduzindo titulo...");
    }
    @Override
    public void parar() {
        System.out.println("Browser Parando titulo... ");
    }
    @Override
    public void pausar() {
        System.out.println("Browser Titulo pausado ");
    }

    @Override
    public boolean cookiesHabilitados() {
        return false;
    }
}
