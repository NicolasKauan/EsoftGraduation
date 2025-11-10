import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComBanco {
    public static Connection getConexaoComBanco(){

        String local = "jdbc:h2:./revisao";
        String user = "sa";
        String password = "";

        try{
            return DriverManager.getConnection(local, user, password);
        }catch(SQLException e){
        System.out.println("Erro para conectar com o banco de dados");
        return null;
        }
    }
}
