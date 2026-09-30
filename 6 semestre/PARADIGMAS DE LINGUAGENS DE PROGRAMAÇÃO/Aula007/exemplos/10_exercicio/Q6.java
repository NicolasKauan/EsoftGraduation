// Exercício Aula 07 - Questão 6: qual é a saída? Onde está o bug?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
public class Main {
    public static void main(String[] args) {
        int acertos = 7, total = 10;
        double taxa = acertos / total * 100;
        System.out.println(taxa + "%");
    }
}
