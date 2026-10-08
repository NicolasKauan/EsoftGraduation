// Exercício Aula 09 - Questão 5: qual é a saída? Por quê?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
class A { static String quem() { return "A"; } }
class B extends A { static String quem() { return "B"; } }

public class Main {
    public static void main(String[] args) {
        A x = new B();
        System.out.println(x.quem());
    }
}
