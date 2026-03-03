package exercicios/interfaces/ex4;
public class Fatura implements Pagavel {
    private final int quantidade;
    private final double precoUnitario;
    public Fatura(int quantidade, double precoUnitario) {
        this.quantidade = quantidade; this.precoUnitario = precoUnitario;
    }
    @Override public double getValorAPagar() { return quantidade * precoUnitario; }
}
