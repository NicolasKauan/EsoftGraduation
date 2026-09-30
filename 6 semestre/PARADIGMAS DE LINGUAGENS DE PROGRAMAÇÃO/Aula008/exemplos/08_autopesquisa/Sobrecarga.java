// Autopesquisa - Subprogramas sobrecarregados (Sebesta 9.9, p. 397-398)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Sobrecarga.java
public class Main {
    static String descrever(int x)    { return "int " + x; }
    static String descrever(double x) { return "double " + x; }
    static String descrever(String s) { return "String " + s; }
    static String descrever(Object o) { return "Object " + o; }

    public static void main(String[] args) {
        System.out.println(descrever(1));      // int 1
        System.out.println(descrever(1.5));    // double 1.5
        System.out.println(descrever("oi"));   // String oi
        System.out.println(descrever('c'));    // int 99: char -> int é a conversão preferida
        System.out.println(descrever(1L));     // double 1.0: long -> double
        System.out.println(descrever(true));   // Object true: boolean vira Boolean
    }
}
