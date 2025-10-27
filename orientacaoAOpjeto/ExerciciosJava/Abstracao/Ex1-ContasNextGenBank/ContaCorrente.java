public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void calcularTaxas() {
        // taxa de R$ 15,00
        this.saldo -= 15.0;
        System.out.println("Taxa de manutenção de R$ 15,00 aplicada. Novo saldo: R$ " + saldo);
    }
}
