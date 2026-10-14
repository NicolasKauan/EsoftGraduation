// Exercício Aula 10 - Questão 1: o que é impresso? Há algum problema?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
public class Main {
    static int vendas = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable caixa = () -> {
            for (int i = 0; i < 100_000; i++) vendas++;
        };
        Thread a = new Thread(caixa), b = new Thread(caixa);
        a.start(); b.start();
        a.join(); b.join();
        System.out.println(vendas);
    }
}
