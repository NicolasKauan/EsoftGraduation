import java.util.ArrayList;
import java.util.List;

public class Computador {
    private int fonteWats;
    private Processador processador;
    private MemoriaRam memoriaRam;
    private List<Periferico> perifericos;

    public Computador(int fonteWats, Processador processador, MemoriaRam memoriaRam) {
        this.fonteWats = fonteWats;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.perifericos = new ArrayList<>();
    }

    public void adicionarPeriferico(Periferico p) {
        perifericos.add(p);
    }

    public void removerPeriferico(Periferico p) {
        perifericos.remove(p);
    }

    public void mostrarConfiguracao() {
        System.out.println("Computador com fonte de " + fonteWats + "W");
        System.out.println(processador);
        System.out.println(memoriaRam);
        System.out.println("Periféricos conectados:");
        for (Periferico p : perifericos) {
            System.out.println("- " + p);
        }
    }
}
