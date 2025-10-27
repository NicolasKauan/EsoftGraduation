public class Boleto implements Pagavel {
    private final double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorAPagar() {
        return valor;
    }
}
