// Aula 11 - Asserções em Java vêm DESLIGADAS (Sebesta 14.3.7, p. 612-613)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java -ea Assercoes.java   (com -ea as asserções são verificadas)
public class Main {
    static int dividir(int a, int b) {
        assert b != 0 : "divisor zero";         // asserção (Java 1.4)
        return b == 0 ? 0 : a / b;
    }

    public static void main(String[] args) {
        System.out.println(dividir(10, 0));     // 0: sem -ea, o assert é ignorado!
        boolean ligadas = false;
        assert ligadas = true;                  // truque: só executa se as asserções estiverem ligadas
        System.out.println("asserções ligadas? " + ligadas);   // false no OneCompiler
        // Com java -ea: AssertionError: divisor zero
    }
}
