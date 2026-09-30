// Aula 08 - Funções como parâmetros em Java: lambdas e referências a métodos (Sebesta 9.6-9.7)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Callbacks.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;

public class Main {
    static int aplicar(IntUnaryOperator f, int x) {   // parâmetro que é uma função
        return f.applyAsInt(x);
    }

    public static void main(String[] args) {
        System.out.println(aplicar(x -> x * 2, 7));   // 14: lambda
        System.out.println(aplicar(Math::abs, -7));   // 7: referência a método

        List<String> nomes = new ArrayList<>(List.of("bia", "Ana", "caio"));
        nomes.sort(Comparator.comparing(String::toLowerCase));   // estratégia passada como parâmetro
        System.out.println(nomes);                               // [Ana, bia, caio]

        Map<String, BinaryOperator<Integer>> ops = Map.of("+", Integer::sum, "*", (a, b) -> a * b);
        System.out.println(ops.get("*").apply(6, 7));            // 42: chamada indireta (p. 393)
    }
}
