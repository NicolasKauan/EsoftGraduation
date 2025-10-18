import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    // Adiciona um produto ao pedido
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Mostra os detalhes do pedido
    public void mostrarDetalhes() {
        System.out.println("Pedido do " + cliente.getNome());
        System.out.println("Produtos comprados:");
        for (Produto p : produtos) {
            System.out.println("- " + p);
        }
    }
}
