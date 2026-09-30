// Autopesquisa - Subprogramas genéricos (Sebesta 9.10.2, p. 400-402)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Generico.java
import java.util.List;

public class Main {
    static <T extends Comparable<T>> T maior(List<T> itens) {   // método genérico com restrição
        T m = itens.get(0);
        for (T x : itens)
            if (x.compareTo(m) > 0) m = x;
        return m;
    }

    public static void main(String[] args) {
        System.out.println(maior(List.of(3, 9, 4)));                   // 9
        System.out.println(maior(List.of("pera", "uva", "abacaxi")));  // uva
    }
}
