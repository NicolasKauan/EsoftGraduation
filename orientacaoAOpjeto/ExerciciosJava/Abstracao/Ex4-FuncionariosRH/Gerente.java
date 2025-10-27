public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        return salarioBase * 0.20;
    }
}
