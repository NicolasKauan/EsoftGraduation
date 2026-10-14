// Autopesquisa - Concorrência em nível de sentença: fluxos paralelos (Sebesta 13.10, p. 586-590)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Paralelo.java
import java.util.stream.LongStream;

public class Main {
    static final long N = 50_000_000L;

    static long medir(boolean paralelo) {
        long t0 = System.nanoTime();
        LongStream s = LongStream.rangeClosed(1, N);
        if (paralelo) s = s.parallel();                // divide o trabalho entre os núcleos
        long soma = s.map(x -> x % 7).sum();
        if (soma != 149_999_998L) throw new AssertionError();
        return (System.nanoTime() - t0) / 1_000_000;
    }

    public static void main(String[] args) {
        System.out.println("núcleos disponíveis: " + Runtime.getRuntime().availableProcessors());
        for (int rodada = 1; rodada <= 3; rodada++)     // as primeiras rodadas "aquecem" o compilador JIT
            System.out.printf("rodada %d: sequencial %4d ms   paralelo %4d ms%n",
                              rodada, medir(false), medir(true));
        // Os tempos dependem da máquina, dos núcleos realmente disponíveis e do aquecimento do JIT:
        // meça várias vezes antes de concluir. (No OneCompiler o contêiner informa 1 núcleo, e mesmo
        // assim os números variam; paralelismo real exige hardware, concorrência não.)
    }
}
