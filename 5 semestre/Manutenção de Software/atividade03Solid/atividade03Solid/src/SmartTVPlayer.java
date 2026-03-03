public class SmartTVPlayer implements StreamingPlayer{

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

}
