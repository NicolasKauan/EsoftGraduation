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
                    list<ItemVendavel> = banco.buscarTodosItens();

                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while (opcao != 5);
    }
}
