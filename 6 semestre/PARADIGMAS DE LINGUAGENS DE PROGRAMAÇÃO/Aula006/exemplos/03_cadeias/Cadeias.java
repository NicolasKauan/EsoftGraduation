// Aula 06 - Cadeias de caracteres (Sebesta 6.3, p. 240-244)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Cadeias.java
// No Windows, se os acentos saírem errados, rode antes: chcp 65001
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String s = "ação";
        System.out.println("length()      = " + s.length());   // 4
        System.out.println("bytes UTF-8   = " + s.getBytes(StandardCharsets.UTF_8).length); // 6

        String joinha = "👍"; // emoji de joinha: fora do plano básico = 2 unidades UTF-16
        System.out.println("joinha.length = " + joinha.length());  // 2
        System.out.println("code points   = " + joinha.codePointCount(0, joinha.length())); // 1

        s.toUpperCase();                // String é imutável: resultado descartado!
        System.out.println(s);          // ação
        s = s.toUpperCase();
        System.out.println(s);          // AÇÃO

        // == compara REFERÊNCIAS; equals compara CONTEÚDO
        String a = "java";
        String b = new String("java");
        System.out.println(a == b);       // false
        System.out.println(a.equals(b));  // true

        StringBuilder sb = new StringBuilder(); // cadeia mutável
        for (int i = 0; i < 3; i++) sb.append("java ");
        System.out.println(sb);
    }
}
