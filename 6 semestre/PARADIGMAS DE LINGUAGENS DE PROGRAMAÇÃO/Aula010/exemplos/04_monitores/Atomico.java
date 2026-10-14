// Aula 10 - Três formas de corrigir a corrida em Java (Sebesta 13.7.4-13.7.7, p. 572-578)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Atomico.java
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static int comSynchronized = 0, comLock = 0;
    static final AtomicInteger atomico = new AtomicInteger();   // sem bloqueio (p. 577)
    static final ReentrantLock trava = new ReentrantLock();     // cadeado explícito (p. 577)

    static synchronized void incrementa() { comSynchronized++; } // cadeado implícito do objeto

    public static void main(String[] args) throws InterruptedException {
        Runnable tarefa = () -> {
            for (int i = 0; i < 200_000; i++) {
                incrementa();
                atomico.incrementAndGet();
                trava.lock();
                try { comLock++; } finally { trava.unlock(); }   // unlock SEMPRE no finally
            }
        };
        Thread[] ts = new Thread[4];
        for (int i = 0; i < 4; i++) { ts[i] = new Thread(tarefa); ts[i].start(); }
        for (Thread t : ts) t.join();
        System.out.println("synchronized:  " + comSynchronized);   // 800000
        System.out.println("AtomicInteger: " + atomico.get());      // 800000
        System.out.println("ReentrantLock: " + comLock);            // 800000
    }
}
