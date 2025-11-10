public class ItemResumo {
    private int id;
    private String nome;
    private double precoBase;
    private String tipo;
    private double precoFinal;
    private double imposto;

    public ItemResumo(int id,String nome, double precoBase, String tipo, double precoFinal, double imposto) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
        this.tipo = tipo;
        this.precoFinal = precoFinal;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getTipo() {
        return tipo;
    }
    public double getPrecoFinal() {
        return precoFinal;
    }
    public double getImposto() {
        return imposto;
    }

    @Override
    public String toString() {
        return String.format("#%d | %s | %s | base=%.2f | final=%.2f | imp=%.2f",
                id, nome, tipo,
                precoBase, precoFinal, imposto);
    }
}
