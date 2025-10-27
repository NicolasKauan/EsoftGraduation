public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca("Ana", 500.0);
        Conta cc = new ContaCorrente("Bruno", 1000.0);

        cp.calcularTaxas();
        cc.calcularTaxas();
    }
}
