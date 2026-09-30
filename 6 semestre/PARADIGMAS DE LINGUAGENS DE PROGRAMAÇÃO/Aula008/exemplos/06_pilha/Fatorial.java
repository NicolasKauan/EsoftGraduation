// Aula 08 - Estouro da pilha de execução (Sebesta 10.3, p. 419-427)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Fatorial.java
public class Main {
    static int profundidade = 0;

    static long fatorial(int n) {
        return n <= 1 ? 1 : n * fatorial(n - 1);
    }

    static void semFim() {
        profundidade++;
        semFim();           // cada chamada empilha mais um registro de ativação
    }

    public static void main(String[] args) {
        System.out.println(fatorial(20));    // 2432902008176640000
        try {
            semFim();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError depois de " + profundidade + " chamadas");
        }
    }
}
