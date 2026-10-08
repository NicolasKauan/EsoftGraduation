// Aula 09 - Herança mal usada: java.util.Stack herda de Vector (Sebesta 12.2.2, p. 489-492)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
// Local:  java StackVector.java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // java.util.Stack (Java 1.0) HERDA de Vector e, com isso, operações que uma pilha não deveria ter
        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.add(0, 99);               // inserir no FUNDO de uma pilha?!
        pilha.remove(2);                // remover do meio?! (índice 2)
        System.out.println(pilha);      // [99, 1, 3]
        System.out.println(pilha.get(1));   // acesso aleatório: 1

        // A própria documentação recomenda ArrayDeque, que só oferece operações de pilha e fila
        Deque<Integer> melhor = new ArrayDeque<>();
        melhor.push(1);
        melhor.push(2);
        System.out.println(melhor.pop());   // 2
    }
}
