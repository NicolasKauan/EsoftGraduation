public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void calcularTaxas() {
        // Poupança sem taxa
        System.out.println("Conta Poupança de " + titular + " sem taxas. Saldo: R$ " + saldo);
    }
}
