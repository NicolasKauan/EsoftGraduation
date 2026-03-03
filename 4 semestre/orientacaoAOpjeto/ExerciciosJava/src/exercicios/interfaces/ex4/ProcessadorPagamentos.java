package exercicios/interfaces/ex4;
import java.util.List;
public class ProcessadorPagamentos {
    public static double totalAPagar(List<Pagavel> itens) {
        double total = 0.0;
        for (Pagavel p : itens) total += p.getValorAPagar();
        return total;
    }
}
