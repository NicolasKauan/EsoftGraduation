// Aula 12 - Exercício 1: resolução (o laço e o pipeline dão o mesmo resultado)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 8, 5, 12, 7, 6);

        int soma = 0;                                  // imperativo
        for (int n : nums) {
            if (n % 2 == 0) {
                soma += n * n;
            }
        }

        int soma2 = nums.stream()                      // funcional
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * n)
            .sum();

        System.out.println(soma + " " + soma2);        // 244 244
    }
}
