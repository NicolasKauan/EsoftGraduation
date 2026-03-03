package exercicios/abstracao/ex1;
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) { super(titular, saldo); }
    @Override public void calcularTaxas() {
        System.out.println("Conta Poupança de " + titular + " sem taxas. Saldo: R$ " + saldo);
    }
}
