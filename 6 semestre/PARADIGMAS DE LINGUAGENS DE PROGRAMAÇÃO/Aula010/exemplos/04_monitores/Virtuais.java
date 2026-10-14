// Aula 10 - Linhas de execução virtuais (Java 21+): milhares de tarefas leves (Sebesta 13.2.1, p. 547)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Virtuais.java   (Java 21+)
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10_000; i++) {
                executor.submit(() -> {
                    Thread.sleep(1000);           // simula uma espera de rede de 1 s
                    return null;
                });
            }
        }                                         // o try espera todas terminarem
        long ms = System.currentTimeMillis() - inicio;
        System.out.println("10.000 tarefas de 1 s terminaram em ~" + Math.round(ms / 1000.0) + " s");
        // Com 10.000 threads de sistema operacional, o custo de memória seria enorme.
    }
}
