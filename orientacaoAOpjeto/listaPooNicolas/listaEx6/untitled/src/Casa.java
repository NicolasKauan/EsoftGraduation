import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos; // composição: só existem dentro da Casa

    public Casa(String endereco, List<Comodo> comodos) {
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa no endereço: ").append(endereco).append("\nCômodos:");
        for (Comodo c : comodos) {
            sb.append("\n - ").append(c.getNome());
        }
        return sb.toString();
    }
}
