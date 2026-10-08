// Exercício Aula 09 - Questão 1: qual é a saída? Por quê?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
class Animal { String som() { return "..."; } }
class Cachorro extends Animal { String som() { return "au"; } }

public class Main {
    public static void main(String[] args) {
        Animal x = new Cachorro();
        System.out.println(x.som());
    }
}
