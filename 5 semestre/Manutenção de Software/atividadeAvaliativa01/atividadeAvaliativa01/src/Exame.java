public abstract class Exame {

    protected String codigo;
    protected String nome;
    protected String tipo;
    protected int duracaoPrevista;
    protected String observacoes;

    public Exame(String codigo, String nome, String tipo, int duracaoPrevista, String observacoes) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.duracaoPrevista = duracaoPrevista;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }
}