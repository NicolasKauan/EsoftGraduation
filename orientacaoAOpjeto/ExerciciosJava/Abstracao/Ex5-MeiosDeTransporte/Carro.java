public class Carro extends MeioTransporte {
    private final double consumoLitrosPorKm;
    private final double precoLitro;

    public Carro(String nome, double consumoLitrosPorKm, double precoLitro) {
        super(nome);
        this.consumoLitrosPorKm = consumoLitrosPorKm;
        this.precoLitro = precoLitro;
    }

    @Override
    public void mover(double km) {
        System.out.println(nome + " dirigiu " + km + " km.");
    }

    @Override
    public double custoPorKm() {
        return consumoLitrosPorKm * precoLitro;
    }
}
