public class Comodo {
    private String nome;

    public Comodo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cômodo: " + nome;
    }
}
