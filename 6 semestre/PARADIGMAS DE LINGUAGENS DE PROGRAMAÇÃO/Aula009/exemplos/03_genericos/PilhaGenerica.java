// Aula 09 - TADs parametrizados em Java: genéricos e apagamento de tipo (Sebesta 11.5.2, p. 472-474)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
// Local:  java PilhaGenerica.java
import java.util.ArrayList;
import java.util.List;

class Pilha<T> {
    private final List<T> dados = new ArrayList<>();
    void empilhar(T x) { dados.add(x); }
    T desempilhar()    { return dados.remove(dados.size() - 1); }
    boolean vazia()    { return dados.isEmpty(); }
}

public class Main {
    static <T extends Comparable<T>> T maior(List<T> xs) {   // T precisa ter compareTo (p. 474)
        T m = xs.get(0);
        for (T x : xs) if (x.compareTo(m) > 0) m = x;
        return m;
    }

    public static void main(String[] args) {
        Pilha<String> nomes = new Pilha<>();
        nomes.empilhar("Ana");
        nomes.empilhar("Bia");
        System.out.println(nomes.desempilhar());       // Bia
        // nomes.empilhar(42);                          // ERRO de compilação: 42 não é String

        Pilha<Integer> nums = new Pilha<>();            // Pilha<int> não existe: só tipos-objeto
        nums.empilhar(7);                               // autoboxing: int -> Integer
        System.out.println(nums.desempilhar() + 1);     // 8

        // Apagamento de tipo: em execução, as duas são a MESMA classe
        System.out.println(nomes.getClass() == nums.getClass());   // true
        System.out.println(maior(List.of(3, 9, 4)));              // 9
    }
}
