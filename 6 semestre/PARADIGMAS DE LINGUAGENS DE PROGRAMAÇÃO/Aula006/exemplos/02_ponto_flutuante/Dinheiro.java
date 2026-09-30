// Aula 06 - Ponto flutuante x decimal (Sebesta 6.2.1.2 e 6.2.1.4, p. 237-238)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Dinheiro.java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double a = 0.1, b = 0.2;
        System.out.println("double      : " + (a + b));

        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.2");
        System.out.println("BigDecimal  : " + x.add(y));

        // Armadilha: criar a partir de double herda o erro de representação
        System.out.println("new BigDecimal(0.1) = " + new BigDecimal(0.1));

        // Divisão exige escala e regra de arredondamento explícitas
        BigDecimal total = new BigDecimal("100.00");
        System.out.println("100 / 3     : "
                + total.divide(new BigDecimal("3"), 2, RoundingMode.HALF_EVEN));

        // Alternativa comum em sistemas financeiros: guardar centavos em long
        long centavos = 10 + 20;
        System.out.printf("centavos    : R$ %d,%02d%n", centavos / 100, centavos % 100);
    }
}
