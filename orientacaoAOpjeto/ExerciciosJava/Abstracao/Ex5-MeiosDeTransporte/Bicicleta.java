public class Bicicleta extends MeioTransporte {

    public Bicicleta(String nome) {
        super(nome);
    }

    @Override
    public void mover(double km) {
        System.out.println(nome + " pedalou " + km + " km.");
    }

    @Override
    public double custoPorKm() {
        return 0.0;
    }
}
