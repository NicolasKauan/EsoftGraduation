public class ProdutoFisico extends ItemVendavel implements Tributavel {
    private double pesoEmKg;

    public ProdutoFisico(double pesoEmKg, String nome, double precoBase){
        super(nome, precoBase);
        this.pesoEmKg = pesoEmKg;
    }

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg){
        this.pesoEmKg = pesoEmKg;
    }

    @Override
    public double precoFinal() {
        return getPrecoBase()+(pesoEmKg*3.50) + calcularImposto();
    }

    @Override
    public String getTipo(){
        return "Fisico";
    }

    @Override
    public double calcularImposto(){
        return getPrecoBase()*0.05;
    }
}
