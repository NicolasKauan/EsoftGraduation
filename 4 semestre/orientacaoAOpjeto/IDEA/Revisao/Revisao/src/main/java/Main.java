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
                    List<String> itemSalvo = banco.buscarTodosItens();
                        if(itemSalvo.isEmpty()){
                            System.out.println("A lista está vazia");
                        } else{
                            itemSalvo.forEach(System.out::println);
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
