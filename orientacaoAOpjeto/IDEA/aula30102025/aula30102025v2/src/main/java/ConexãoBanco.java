import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexãoBanco {

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/";
        String usuario = "root";
        String senha = "";

        /*String driver = "jdbc:h2:./banco_teste";
        String usuario2 = "sa";
        String senha2 = "";*/

        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.out.println("Houve um problema para conectar com o banco!");
        }
        return conexao;
    }
}
