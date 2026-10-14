// Aula 10 - Impasse (deadlock): A tem X e quer Y; B tem Y e quer X (Sebesta 13.2.1, p. 551)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Impasse.java
import java.lang.management.ManagementFactory;

public class Main {
    static final Object X = new Object(), Y = new Object();   // dois recursos compartilhados

    static void pausa() {
        try { Thread.sleep(100); } catch (InterruptedException e) { }
    }

    public static void main(String[] args) throws Exception {
        Thread a = new Thread(() -> {
            synchronized (X) { pausa(); synchronized (Y) { System.out.println("A terminou"); } }
        });
        Thread b = new Thread(() -> {
            synchronized (Y) { pausa(); synchronized (X) { System.out.println("B terminou"); } }
        });
        a.start();
        b.start();
        Thread.sleep(1000);
        long[] presas = ManagementFactory.getThreadMXBean().findDeadlockedThreads();
        System.out.println(presas == null ? "sem impasse"
                                          : "IMPASSE: " + presas.length + " linhas de execução presas");
        System.exit(0);   // encerra à força: as duas tarefas nunca terminariam sozinhas
    }
}
