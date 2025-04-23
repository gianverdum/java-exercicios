package aulas.jdbc;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConnection() {
        try {
            Dotenv dotenv = Dotenv.load();

            String dbName = "curso_java";
            String url = dotenv.get("URL") + dbName;
            String usuario = dotenv.get("USERNAME");
            String senha = dotenv.get("PASSWORD");

            return DriverManager.getConnection(url,usuario,senha);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
