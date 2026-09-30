// Aula 08 - Java passa SEMPRE por valor, inclusive as referências (Sebesta 9.5.4, p. 383)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Troca.java
public class Main {
    static class Ponto {
        int x;
        Ponto(int x) { this.x = x; }
    }

    static void troca(int a, int b) { int t = a; a = b; b = t; }   // troca as cópias
    static void altera(Ponto p) { p.x = 99; }                      // altera o OBJETO: o chamador vê
    static void reatribui(Ponto p) { p = new Ponto(-1); }          // muda a cópia da referência

    public static void main(String[] args) {
        int x = 1, y = 2;
        troca(x, y);
        System.out.println("x=" + x + " y=" + y);            // x=1 y=2

        Ponto p = new Ponto(1);
        altera(p);
        System.out.println("depois de altera: " + p.x);      // 99
        reatribui(p);
        System.out.println("depois de reatribui: " + p.x);   // 99: a referência do chamador não mudou
    }
}
