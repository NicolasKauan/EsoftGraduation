// Aula 07 - Operadores sobrecarregados (Sebesta 7.3, p. 309)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Sobrecarga.java
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Java só sobrecarrega operadores embutidos: + para números e para String
        System.out.println(1 + 2);           // 3
        System.out.println("1" + 2);         // 12
        System.out.println('a' + 1);         // 98: char vira int!
        System.out.println("" + 'a' + 1);    // a1

        // O programador NÃO pode sobrecarregar operadores: BigDecimal usa métodos
        BigDecimal x = new BigDecimal("0.1"), y = new BigDecimal("0.2");
        System.out.println(x.add(y).multiply(new BigDecimal("3")));   // 0.9
        // System.out.println(x + y);        // ERRO de compilação
    }
}
