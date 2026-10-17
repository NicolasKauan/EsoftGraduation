// Exercício Aula 11 - Questão 1: o que é impresso?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
public class Main {
    static int f() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
