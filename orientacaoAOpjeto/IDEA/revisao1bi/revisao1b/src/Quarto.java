public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    public Hospede hospede;


    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.hospede = null;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
    }

    public void ocupar(Hospede hospede) {
        if (!ocupado) {
            this.hospede = hospede;
            ocupado = true;
        } else {
            System.out.printf("O quarto " + numero + " Já está ocupado!\n");
        }
    }
    public void liberar(){
        if(ocupado){
           this.hospede = null;
           ocupado = false;
        } else {
            System.out.printf("O quarto " + numero + " já esta livre!\n");
        }
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado(){
        return ocupado;
    }

    public Hospede getHospedeAtual(){
        return this.hospede;
    }

    public String getTipo() {
        return tipo;
    }
}
