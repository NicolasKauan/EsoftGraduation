public class ServicoDigital extends ItemVendavel {

    private int duracaoMeses;

    public ServicoDigital( int duracaoMeses, String nome, double precoBase){
        super(nome, precoBase);
        this.duracaoMeses = duracaoMeses;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    @Override
    public double calcularPrecoFinal(){
        return getPrecoBase()*duracaoMeses;
    }

    @Override
    public String getTipo(){
        return "Digital";
    }
}
