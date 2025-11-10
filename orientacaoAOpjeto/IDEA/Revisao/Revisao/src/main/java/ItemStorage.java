import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ItemStorage {
    public void criarTabela(){
        String  sql =
                "CREATE TABLE IF NOT EXISTS itens("+
                        "id INT AUTO_INCREMENT PRIMARY KEY,"+
                        "nome VARCHAR(255) NOT NULL,"+
                        "preco_base DOUBLE,"+
                        "tipo VARCHAR(50),"+
                        "preco_final DOUBLE,"+
                        "imposto DOUBLE"+
                        ");";
        try(Connection conexao = ConexaoComBanco.getConexaoComBanco()){
            Statement veiculo = conexao.createStatement();
            veiculo.execute(sql);
            System.out.println("Tabela criada com sucesso!");
        } catch(SQLException erro){
            System.out.println("Erro ao criar a tabela!");
        }
    }
    public void salvarItem(ItemVendavel item){
        String sql =
                "INSERT INTO itens (nome, preco_base, tipo, preco_final, imposto) VALUES (?,?,?,?,?)";
        try(Connection conexao = ConexaoComBanco.getConexaoComBanco()){
            PreparedStatement veiculo = conexao.prepareStatement(sql);

            veiculo.setString(1, item.getNome());
            veiculo.setDouble(2, item.getPrecoBase());
            veiculo.setString(3, item.getTipo());
            veiculo.setDouble(4, item.precoFinal());
            veiculo.setDouble(5,item.calcularImposto());
            int resultado = veiculo.executeUpdate();
            if(resultado == 1){
                System.out.println("Item salvo com sucesso!");
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao salvar na tabela!");
        }
    }
    public List<ItemVendavel> buscarTodosItens(){
        String sql = "SELECT * FROM itens;";
        List<ItemVendavel> saida = new ArrayList<>();

        try(Connection conexao = ConexaoComBanco.getConexaoComBanco()){
            PreparedStatement veiculo = conexao.prepareStatement(sql);
            ResultSet cursor = veiculo.executeQuery();
            while(cursor.next()){
                saida.add( new ItemResumo(
                        cursor.getInt("id");
                        cursor.getString("nome");
                        cursor.getDouble("preco_base");
                        cursor.getString("tipo");
                        cursor.getDouble("preco_final");
                        cursor.getDouble("imposto");
                ));
                }
        }catch(SQLException erro){
            System.out.println("Erro ao buscar todos os itens!");
        }
        return saida;
    }
    public void atualizarPrecoBase(int id, double novoPrecoBase){

    }
    public void deletarItem(int id){}


}
