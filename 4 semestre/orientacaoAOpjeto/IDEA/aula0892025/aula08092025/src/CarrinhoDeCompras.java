import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Livro> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Livro livro) {
        itens.add(livro);
        System.out.println(livro.getTitulo() + " adicionado ao carrinho.");
    }

    public void removerItem(Livro livro) {
        if (itens.remove(livro)) {
            System.out.println(livro.getTitulo() + " removido do carrinho.");
        } else {
            System.out.println("Livro não encontrado no carrinho.");
        }
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Livro livro : itens) {
                System.out.println(livro);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Livro livro : itens) {
            total += livro.getPreco();
        }
        return total;
    }
}
