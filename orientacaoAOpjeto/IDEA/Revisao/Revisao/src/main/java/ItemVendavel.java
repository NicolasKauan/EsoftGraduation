public abstract class ItemVendavel {
    private int id;
    private String nome;
    private double  precoBase;
    public ItemVendavel(String nome, double precoBase){
        this.nome =  nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
    public abstract String getTipo();

    public double calcularImposto(){
        return 0.0;
    }

}
