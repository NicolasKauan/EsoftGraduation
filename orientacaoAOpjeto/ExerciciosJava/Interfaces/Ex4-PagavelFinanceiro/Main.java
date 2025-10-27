import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pagavel> itens = new ArrayList<>();
        itens.add(new Boleto(150.0));
        itens.add(new Fatura(3, 49.9));

        double total = ProcessadorPagamentos.totalAPagar(itens);
        System.out.println("Total a pagar: R$ " + total);
    }
}
