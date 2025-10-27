public abstract class MeioTransporte {
    protected String nome;

    public MeioTransporte(String nome) {
        this.nome = nome;
    }

    public abstract void mover(double km);
    public abstract double custoPorKm();
}
