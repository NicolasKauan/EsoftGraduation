// Aula 12 - Exercício 1: reescreva o laço como um pipeline (stream)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 8, 5, 12, 7, 6);
        int soma = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                soma += n * n;
            }
        }
        System.out.println(soma);
    }
}
