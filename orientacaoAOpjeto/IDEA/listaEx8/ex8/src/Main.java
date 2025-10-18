public class Main {
    public static void main(String[] args) {
        // Criando cliente
        Cliente cliente1 = new Cliente("João Silva", 123456789);

        // Criando produtos
        Produto produto1 = new Produto("Notebook", 3500);
        Produto produto2 = new Produto("Mouse", 80);
        Produto produto3 = new Produto("Teclado", 120);

        // Criando pedido
        Pedido pedido = new Pedido(cliente1);

        // Adicionando produtos ao pedido
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        // Mostrando detalhes do pedido
        pedido.mostrarDetalhes();
    }
}
