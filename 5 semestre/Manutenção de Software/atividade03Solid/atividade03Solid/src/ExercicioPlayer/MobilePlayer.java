package ExercicioPlayer;

public class MobilePlayer implements StreamingPlayer{

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

    public void baixarTitulos(){
        System.out.println("Titulo baixado com sucesso! ");
    }

}
