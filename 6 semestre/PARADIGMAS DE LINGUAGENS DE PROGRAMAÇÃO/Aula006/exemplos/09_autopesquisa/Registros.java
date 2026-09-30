// Autopesquisa - Registros (Sebesta 6.7, p. 263-266) com record (Java 16+)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Registros.java
public class Main {
    record Aluno(String nome, int ra, double media) {
        Aluno { // construtor compacto: validação
            if (media < 0 || media > 10) throw new IllegalArgumentException("média inválida");
        }

        boolean aprovado() { return media >= 6; }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Ana", 123, 7.5);
        System.out.println(a);                                    // toString gerado
        System.out.println(a.nome() + " aprovado? " + a.aprovado());
        System.out.println(a.equals(new Aluno("Ana", 123, 7.5))); // true: igualdade por valor
    }
}
