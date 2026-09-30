// Aula 06 - Tipos de referência e null (Sebesta 6.11.5-6.11.6, p. 278-280)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Referencias.java
import java.util.Optional;

public class Main {
    static class Conta {
        double saldo;
        Conta(double saldo) { this.saldo = saldo; }
    }

    static Optional<String> buscarNome(int id) {
        return id == 1 ? Optional.of("Ana") : Optional.empty();
    }

    public static void main(String[] args) {
        Conta a = new Conta(100);
        Conta b = a;                 // a e b referenciam o MESMO objeto (apelidos)
        b.saldo = 0;
        System.out.println("a.saldo = " + a.saldo);  // 0.0

        a = null;                    // o objeto ainda é alcançável por b
        b = null;                    // agora é lixo: o coletor (GC) libera sozinho

        String nome = null;
        try {
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // Optional: a "ausência de valor" vira parte do tipo
        System.out.println(buscarNome(1).map(String::length).orElse(0)); // 3
        System.out.println(buscarNome(2).map(String::length).orElse(0)); // 0
    }
}
