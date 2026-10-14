// Exercício Aula 10 - Questão 4: o que acontece? (o programa se encerra sozinho depois de 1 s)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
public class Main {
    static class Conta { int saldo = 100; }

    static void transferir(Conta de, Conta para, int valor) {
        synchronized (de) {
            dorme(50);
            synchronized (para) {
                de.saldo -= valor;
                para.saldo += valor;
            }
        }
    }

    static void dorme(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }

    public static void main(String[] args) throws Exception {
        Conta a = new Conta(), b = new Conta();
        new Thread(() -> transferir(a, b, 10)).start();
        new Thread(() -> transferir(b, a, 20)).start();
        Thread.sleep(1000);
        long[] presas = java.lang.management.ManagementFactory.getThreadMXBean().findDeadlockedThreads();
        System.out.println(presas == null ? "tudo certo" : "linhas de execução presas: " + presas.length);
        System.out.println("saldos: " + a.saldo + " " + b.saldo);
        System.exit(0);
    }
}
