
public class Autor {
    public String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    void exibirAutor() {
        System.out.println("Nome: " + this.nome);
    }
}
