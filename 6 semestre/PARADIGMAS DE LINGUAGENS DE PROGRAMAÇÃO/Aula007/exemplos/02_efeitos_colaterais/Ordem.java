// Aula 07 - Ordem de avaliação dos operandos e efeitos colaterais (Sebesta 7.2.2, p. 307-308)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Ordem.java
public class Main {
    static int a = 5;

    static int fun1() {
        a = 17;          // efeito colateral
        return 3;
    }

    public static void main(String[] args) {
        a = a + fun1();                  // Java GARANTE: operandos da esquerda para a direita (p. 308)
        System.out.println("a = " + a);  // sempre 8

        int i = 1;
        int j = i++ + i++;               // definido em Java: 1 + 2
        System.out.println("j = " + j + ", i = " + i);   // j = 3, i = 3
    }
}
