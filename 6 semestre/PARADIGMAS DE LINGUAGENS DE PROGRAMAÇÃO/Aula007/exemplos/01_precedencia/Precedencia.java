// Aula 07 - Precedência e associatividade (Sebesta 7.2.1, p. 301-305)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Precedencia.java
public class Main {
    public static void main(String[] args) {
        System.out.println(1 + 2 + "3" + 4 + 5);   // 3345: + associa à esquerda
        System.out.println("x" + 1 + 2);           // x12
        System.out.println("x" + (1 + 2));         // x3
        System.out.println(7 / 2 * 2.0);           // 6.0: 7 / 2 é divisão inteira (3)
        System.out.println(2.0 * 7 / 2);           // 7.0
        System.out.println(-7 / 2 + " " + -7 % 2); // -3 -1: Java trunca em direção a zero
        System.out.println(Math.pow(2, 10));       // 1024.0: Java não tem operador **
    }
}
