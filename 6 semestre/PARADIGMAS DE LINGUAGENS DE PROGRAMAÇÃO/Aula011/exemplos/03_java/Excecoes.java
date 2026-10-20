// Aula 11 - Exceções em Java: verificadas, não verificadas e finally (Sebesta 14.3, p. 606-613)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Excecoes.java
import java.io.IOException;

public class Main {
    static class SaldoInsuficienteException extends Exception {    // VERIFICADA (checked)
        final double falta;
        SaldoInsuficienteException(double falta) {
            super("saldo insuficiente");
            this.falta = falta;
        }
    }

    static double saldo = 100;

    static void sacar(double valor) throws SaldoInsuficienteException {   // cláusula throws (p. 609)
        if (valor > saldo) throw new SaldoInsuficienteException(valor - saldo);
        saldo -= valor;
    }

    static void ler() throws IOException {
        throw new IOException("disco indisponível");
    }

    public static void main(String[] args) {
        try {
            sacar(30);
            sacar(250);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage() + ": faltam " + e.falta);
        } finally {
            System.out.println("finally: sempre executa (saldo = " + saldo + ")");   // p. 611
        }

        // sacar(10);   // ERRO de compilação: exceção verificada não tratada nem declarada

        try {
            ler();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        int[] v = new int[2];
        try {
            v[5] = 1;                            // RuntimeException: NÃO verificada
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
