// Aula 10 - Condição de corrida: atualizações perdidas (Sebesta 13.2.1, p. 548)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Corrida.java
public class Main {
    static int contador = 0;                        // dado COMPARTILHADO

    public static void main(String[] args) throws InterruptedException {
        Runnable incrementa = () -> {
            for (int i = 0; i < 1_000_000; i++)
                contador++;                         // ler, somar e gravar: 3 passos (p. 548)
        };
        Thread t1 = new Thread(incrementa);
        Thread t2 = new Thread(incrementa);
        t1.start();
        t2.start();
        t1.join();                                  // espera t1 terminar
        t2.join();
        System.out.println("esperado: 2000000");
        System.out.println("obtido:   " + contador);   // quase sempre MENOS, e muda a cada execução
    }
}
