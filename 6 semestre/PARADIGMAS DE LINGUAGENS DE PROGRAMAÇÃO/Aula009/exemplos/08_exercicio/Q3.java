// Exercício Aula 09 - Questão 3: qual é a saída? Por quê?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
class A { String nome = "A"; String getNome() { return nome; } }
class B extends A { String nome = "B"; String getNome() { return nome; } }

public class Main {
    public static void main(String[] args) {
        A x = new B();
        System.out.println(x.nome + " " + x.getNome());
    }
}
