// Aula 08 - Parâmetros em Java: sem palavra-chave e sem valor padrão (Sebesta 9.2.3, p. 367-371)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Parametros.java
public class Main {
    static double salario(double renda, double aliquota) {
        return salario(renda, aliquota, 1);      // "valor padrão" simulado com sobrecarga (9.9, p. 397)
    }

    static double salario(double renda, double aliquota, int dependentes) {
        return renda * (1 - aliquota) + 100 * dependentes;
    }

    static double media(double... valores) {     // varargs: o compilador cria um double[]
        double soma = 0;
        for (double v : valores) soma += v;
        return soma / valores.length;
    }

    public static void main(String[] args) {
        System.out.println(salario(2000.0, 0.15));        // 1800.0
        System.out.println(salario(2000.0, 0.15, 3));     // 2000.0
        System.out.println(media(7, 8, 9));               // 8.0
        System.out.printf("%s tem %d anos%n", "Ana", 20); // printf também é variádico
    }
}
