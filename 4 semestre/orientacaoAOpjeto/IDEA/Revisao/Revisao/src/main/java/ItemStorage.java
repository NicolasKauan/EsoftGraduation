import javax.xml.transform.Source;
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
            veiculo.setDouble(4, item.calcularPrecoFinal());
            veiculo.setDouble(5,item.calcularImposto());
            int resultado = veiculo.executeUpdate();
            if(resultado == 1){
                System.out.println("Item salvo com sucesso!");
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao salvar na tabela!");
        }
    }
    public List<String> buscarTodosItens(){
        String sql = "SELECT * FROM itens;";
        List<String> itens = new ArrayList<>();

        try(Connection conexao = ConexaoComBanco.getConexaoComBanco()) {
            PreparedStatement veiculo = conexao.prepareStatement(sql);
            ResultSet cursor = veiculo.executeQuery();
            while (cursor.next()) {
                int id = cursor.getInt("id");
                String nome = cursor.getString("nome");
                Double preco_base = cursor.getDouble("preco_base");
                String tipo = cursor.getString("tipo");
                Double preco_final = cursor.getDouble("preco_final");
                Double imposto = cursor.getDouble("imposto");

                String linha = String.format("%d | %s | %s | base=%.2f | final=%.2f | imp=%.2f", id, nome,tipo,preco_base,preco_final,imposto);
                itens.add(linha);
            };
        }catch(SQLException erro){
            System.out.println("Erro ao buscar todos os itens!");
        }
        return itens;
    }
    public void atualizarPrecoBase(double novoPrecoBase, int id){
        String sql = "UPDATE itens SET preco_base = ? WHERE id = ?;";

        try (Connection conexao = ConexaoComBanco.getConexaoComBanco()){
            PreparedStatement veiculo = conexao.prepareStatement(sql);
            veiculo.setDouble(1, novoPrecoBase);
            veiculo.setInt(2, id);
            veiculo.executeUpdate();
            System.out.println("Item atualizado com sucesso!");
        }catch (SQLException erro){
            System.out.println("Erro ao atualizar o item!");
        }

    }
    public void deletarItem(int id){
        String sql = "DELETE FROM itens WHERE id = ?";

        try(Connection conexao = ConexaoComBanco.getConexaoComBanco()){
            PreparedStatement veiculo = conexao.prepareStatement(sql);
            veiculo.setInt(1, id);
            veiculo.executeUpdate();
            System.out.println("Item excluido com sucesso!");
        }catch(SQLException erro){
            System.out.println("Erro ao deleter item!");
        }
    }

}
