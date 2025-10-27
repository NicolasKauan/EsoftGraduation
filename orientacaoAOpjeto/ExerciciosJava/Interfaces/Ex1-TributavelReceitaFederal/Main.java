import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tributavel cc = new ContaCorrente(1000.0);
        Tributavel seguro = new SeguroDeVida();

        System.out.println("Imposto ContaCorrente: R$ " + cc.getValorImposto());
        System.out.println("Imposto SeguroDeVida: R$ " + seguro.getValorImposto());

        // Prévia de polimorfismo com interfaces (soma total)
        List<Tributavel> itens = new ArrayList<>();
        itens.add(cc);
        itens.add(seguro);

        double total = 0.0;
        for (Tributavel t : itens) {
            total += t.getValorImposto();
        }
        System.out.println("Imposto total: R$ " + total);
    }
}
