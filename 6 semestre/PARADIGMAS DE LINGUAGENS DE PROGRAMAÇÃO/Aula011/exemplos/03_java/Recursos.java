// Aula 11 - Finalização com try-with-resources (Java 7+) (Sebesta 14.3.6, p. 611-612)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Recursos.java
public class Main {
    static class Arquivo implements AutoCloseable {
        final String nome;
        Arquivo(String nome) { this.nome = nome; System.out.println("abre " + nome); }
        String ler() {
            if (nome.equals("b.txt")) throw new IllegalStateException("falha ao ler " + nome);
            return "conteúdo de " + nome;
        }
        @Override
        public void close() { System.out.println("fecha " + nome); }
    }

    public static void main(String[] args) {
        try (Arquivo a = new Arquivo("a.txt"); Arquivo b = new Arquivo("b.txt")) {
            System.out.println(a.ler());
            System.out.println(b.ler());
        } catch (IllegalStateException e) {
            System.out.println("erro: " + e.getMessage());
        }
        // Os recursos são fechados na ordem INVERSA e ANTES do catch executar
    }
}
