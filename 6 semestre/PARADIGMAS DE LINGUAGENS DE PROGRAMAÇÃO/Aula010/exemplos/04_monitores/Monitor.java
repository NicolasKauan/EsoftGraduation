// Aula 10 - Monitor em Java: synchronized + wait/notifyAll (Sebesta 13.4 e 13.7.4-13.7.5, p. 557-576)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Monitor.java
public class Main {
    // Monitor: os dados compartilhados e as operações ficam JUNTOS, como num TAD (p. 557)
    static class Fila {
        private final int[] dados = new int[3];
        private int ocupados = 0, entra = 0, sai = 0;

        synchronized void depositar(int v) throws InterruptedException {  // exclusão mútua automática
            while (ocupados == dados.length) wait();   // cooperação: espera haver espaço
            dados[entra] = v;
            entra = (entra + 1) % dados.length;
            ocupados++;
            notifyAll();                               // acorda quem estava esperando (p. 578)
        }

        synchronized int retirar() throws InterruptedException {
            while (ocupados == 0) wait();              // cooperação: espera haver um valor
            int v = dados[sai];
            sai = (sai + 1) % dados.length;
            ocupados--;
            notifyAll();
            return v;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila();
        Thread produtor = new Thread(() -> {
            try { for (int i = 1; i <= 10; i++) fila.depositar(i); } catch (InterruptedException e) { }
        });
        final int[] soma = {0};
        Thread consumidor = new Thread(() -> {
            try { for (int i = 1; i <= 10; i++) soma[0] += fila.retirar(); } catch (InterruptedException e) { }
        });
        produtor.start();
        consumidor.start();
        produtor.join();
        consumidor.join();
        System.out.println("soma = " + soma[0]);    // sempre 55
    }
}
