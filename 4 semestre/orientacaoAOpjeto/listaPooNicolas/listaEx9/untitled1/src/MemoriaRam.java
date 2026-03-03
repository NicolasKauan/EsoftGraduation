public class MemoriaRam {
    private String marca;
    private int qtdGb;

    public MemoriaRam(String marca, int qtdGb) {
        this.marca = marca;
        this.qtdGb = qtdGb;
    }

    public String getMarca() {
        return marca;
    }

    public int getQtdGb() {
        return qtdGb;
    }

    @Override
    public String toString() {
        return "Memória RAM: " + marca + " - " + qtdGb + "GB";
    }
}
