// Aula 10 - Produtor-consumidor com semáforos (Sebesta 13.3 e 13.7.3, p. 552-557 e 572)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Semaforo.java
import java.util.concurrent.Semaphore;

public class Main {
    static final int TAM = 3;
    static final int[] buffer = new int[TAM];
    static int entra = 0, sai = 0;
    static final Semaphore vazios = new Semaphore(TAM);   // emptyspots do livro
    static final Semaphore cheios = new Semaphore(0);     // fullspots do livro
    static final Semaphore acesso = new Semaphore(1);     // semáforo binário: competição (p. 555)

    public static void main(String[] args) throws InterruptedException {
        Thread produtor = new Thread(() -> {
            try {
                for (int v = 1; v <= 6; v++) {
                    vazios.acquire();                 // wait(emptyspots): espera um espaço vazio
                    acesso.acquire();
                    buffer[entra] = v;
                    entra = (entra + 1) % TAM;
                    System.out.println("produziu " + v);
                    acesso.release();
                    cheios.release();                 // release(fullspots): avisa que há um valor
                }
            } catch (InterruptedException e) { }
        });
        Thread consumidor = new Thread(() -> {
            try {
                for (int k = 1; k <= 6; k++) {
                    cheios.acquire();                 // espera haver um valor
                    acesso.acquire();
                    int v = buffer[sai];
                    sai = (sai + 1) % TAM;
                    acesso.release();
                    vazios.release();                 // libera um espaço
                    System.out.println("        consumiu " + v);
                }
            } catch (InterruptedException e) { }
        });
        produtor.start();
        consumidor.start();
        produtor.join();
        consumidor.join();
        System.out.println("fim: nenhum valor perdido nem repetido (a intercalação das linhas varia)");
    }
}
