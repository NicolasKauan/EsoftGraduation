public class Main {
    public static void main(String[] args) {
        Funcionario g = new Gerente("Lia", 8000.0);
        Funcionario v = new Vendedor("Rafa", 2500.0, 12000.0);

        System.out.println("Gerente: " + g.salarioComBonificacao());
        System.out.println("Vendedor: " + v.salarioComBonificacao());
    }
}
