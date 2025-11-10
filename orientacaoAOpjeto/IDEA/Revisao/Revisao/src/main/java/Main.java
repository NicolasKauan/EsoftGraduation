import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ItemStorage banco = new ItemStorage();
        banco.criarTabela();

        CriaItem item = new CriaItem();

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println(" ====== Controle de Estoque ======");
            System.out.println(" 1 - Adicionar Produto");
            System.out.println(" 2 - Listar Produtos");
            System.out.println(" 3 - Atualizar Produto");
            System.out.println(" 4 - Deletar Produto");
            System.out.println(" 5 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    ItemVendavel novoItem = item.criar();
                    banco.salvarItem(novoItem);
                    break;
                case 2:
                    List<ItemVendavel> itemSalvo = banco.buscarTodosItens();
                    for (ItemVendavel iS: itemSalvo){
                        System.out.printf("%d | %s | %s | base=%.2f | final=%.2f | imp=%.2f\n",
                                iS.getId(), iS.getNome(), iS.getTipo(),iS.getPrecoBase(), iS.calcularPrecoFinal(),
                                iS.calcularImposto());
                    }
                    break;
                case 3:
                    System.out.println("ID do item: ");
                    int id = leitor.nextInt();
                    System.out.println("Preco base a ser trocado: ");
                    Double preco_base = leitor.nextDouble();
                    banco.atualizarPrecoBase(preco_base, id);
                    break;
                case 4:
                    System.out.println("ID do item: ");
                    int idDelete = leitor.nextInt();
                    banco.deletarItem(idDelete);
                    break;
            }
        }while (opcao != 5);
    }
}
