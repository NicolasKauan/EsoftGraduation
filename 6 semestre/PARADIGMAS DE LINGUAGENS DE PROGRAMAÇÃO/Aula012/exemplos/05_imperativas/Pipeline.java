// Aula 12 - Programação funcional em Java: lambdas e Streams (Sebesta 15.10, p. 676)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    record Produto(String nome, String categoria, double preco) {}   // imutável

    public static void main(String[] args) {
        // Lambda (Java 8): parâmetro -> expressão (p. 676)
        Function<Integer, Integer> cubo = x -> x * x * x;
        System.out.println(cubo.apply(2));                          // 8

        // Composição: compose e andThen
        Function<Integer, Integer> f = x -> x + 2;
        Function<Integer, Integer> g = x -> 3 * x;
        System.out.println(f.compose(g).apply(4));                  // f(g(4)) = 14
        System.out.println(f.andThen(g).apply(4));                  // g(f(4)) = 18

        // Fechamento: a lambda captura uma variável local (que precisa ser efetivamente final)
        int limite = 100;
        Predicate<Double> caro = p -> p > limite;

        List<Produto> produtos = List.of(
            new Produto("Teclado", "periférico", 150.0),
            new Produto("Mouse", "periférico", 80.0),
            new Produto("Monitor", "vídeo", 900.0),
            new Produto("Cabo HDMI", "vídeo", 35.0));

        // Pipeline: transformar -> filtrar -> reduzir
        double totalCaros = produtos.stream()
            .map(Produto::preco)
            .filter(caro)
            .reduce(0.0, Double::sum);
        System.out.println(totalCaros);                             // 1050.0

        List<String> nomes = produtos.stream()
            .filter(p -> p.categoria().equals("vídeo"))
            .map(p -> p.nome().toUpperCase())
            .sorted()
            .toList();
        System.out.println(nomes);                                  // [CABO HDMI, MONITOR]

        // Agrupamento: um "GROUP BY" sem laço nem variável acumuladora
        Map<String, Double> porCategoria = produtos.stream()
            .collect(Collectors.groupingBy(Produto::categoria, TreeMap::new,
                     Collectors.summingDouble(Produto::preco)));
        System.out.println(porCategoria);                           // {periférico=230.0, vídeo=935.0}

        // Stream infinito e preguiçoso: só calcula o que for pedido
        System.out.println(Stream.iterate(1, n -> n * 2).limit(10).toList());
    }
}
