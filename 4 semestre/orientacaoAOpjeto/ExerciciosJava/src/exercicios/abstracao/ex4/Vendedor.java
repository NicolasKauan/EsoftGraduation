package exercicios/abstracao/ex4;
public class Vendedor extends Funcionario {
    private final double vendasNoMes;
    public Vendedor(String nome, double salarioBase, double vendasNoMes) {
        super(nome, salarioBase); this.vendasNoMes = vendasNoMes;
    }
    @Override public double calcularBonificacao() { return vendasNoMes * 0.10; }
}
