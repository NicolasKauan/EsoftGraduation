package ExercicioPlayer;

public class SmartTVPlayer implements StreamingPlayer{

    @Override
    public void reproduzirTitulo() {
        System.out.println("SmartTV Reproduzindo titulo...");
    }
    @Override
    public void parar() {
        System.out.println("SmartTV Parando titulo... ");
    }
    @Override
    public void pausar() {
        System.out.println("SmartTV Titulo pausado ");
    }

}
