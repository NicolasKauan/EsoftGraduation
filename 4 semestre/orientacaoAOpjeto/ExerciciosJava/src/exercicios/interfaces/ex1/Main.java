package exercicios/interfaces/ex1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Tributavel cc = new ContaCorrente(1000.0);
        Tributavel seg = new SeguroDeVida();
        List<Tributavel> itens = Arrays.asList(cc, seg);
        double total = itens.stream().mapToDouble(Tributavel::getValorImposto).sum();
        System.out.println("Imposto CC: " + cc.getValorImposto());
        System.out.println("Imposto Seguro: " + seg.getValorImposto());
        System.out.println("Total: " + total);
    }
}
