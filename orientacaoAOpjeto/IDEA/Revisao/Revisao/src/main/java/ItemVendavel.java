public abstract class ItemVendavel {
    private String nome;
    private double  precoBase;
    public ItemVendavel(String nome, double precoBase){
        this.nome =  nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    public abstract double precoFinal();
    public abstract String getTipo();


    public double calcularImposto(){
        return 0.0;
    }

}
