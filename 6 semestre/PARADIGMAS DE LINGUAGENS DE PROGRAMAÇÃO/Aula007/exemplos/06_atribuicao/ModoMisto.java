// Aula 07 - Atribuição de modo misto em Java (Sebesta 7.8, p. 321-322)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java ModoMisto.java
public class Main {
    public static void main(String[] args) {
        double d = 3;            // ok: alargamento int -> double
        // int i = 3.7;          // ERRO de compilação: estreitamento exige cast (p. 322)
        int i = (int) 3.7;       // 3
        long l = i;              // ok: alargamento
        // float g = 1.5;        // ERRO: o literal 1.5 é double
        char c = 65;             // ok: a constante cabe em char
        System.out.println(d + " " + i + " " + l + " " + c);   // 3.0 3 3 A

        i += 3.7;                // COMPILA! += inclui um cast: i = (int) (i + 3.7)
        System.out.println(i);   // 6
    }
}
