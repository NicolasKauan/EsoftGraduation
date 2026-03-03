package ExercicioPlayer;

public class MobilePlayer implements StreamingPlayer, IBaixavel{

    @Override
    public void reproduzirTitulo() {
        System.out.println(" Mobile Reproduzindo titulo...");
    }
    @Override
    public void parar() {
        System.out.println(" Mobile Parando titulo... ");
    }
    @Override
    public void pausar() {
        System.out.println(" Mobile Titulo pausado ");
    }

    public void baixarTitulos(){
        System.out.println("Titulo baixado com sucesso! ");
    }
}
