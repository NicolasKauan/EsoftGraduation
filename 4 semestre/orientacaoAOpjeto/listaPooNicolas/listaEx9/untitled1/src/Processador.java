public class Processador {
    private int nucleos;
    private int threads;

    public Processador(int nucleos, int threads) {
        this.nucleos = nucleos;
        this.threads = threads;
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "Processador: " + nucleos + " núcleos, " + threads + " threads";
    }
}
