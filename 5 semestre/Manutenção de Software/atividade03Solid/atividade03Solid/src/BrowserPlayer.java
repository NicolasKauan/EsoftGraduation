public class BrowserPlayer implements StreamingPlayer{
    private boolean cookiesHabilitados;

    public BrowserPlayer(boolean cookiesHabilitados){
        this.cookiesHabilitados = cookiesHabilitados;
    }

    @Override
    public void reproduzirTitulo() {
        System.out.println("Reproduzindo titulo...");
    }
    @Override
    public void parar() {
        System.out.println("Parando titulo... ");
    }
    @Override
    public void pausar() {
        System.out.println("Titulo pausado ");
    }

    public boolean isCookiesHabilitados() {
        return cookiesHabilitados;
    }

    public void setCookiesHabilitados(boolean cookiesHabilitados) {
        this.cookiesHabilitados = cookiesHabilitados;
    }
}
