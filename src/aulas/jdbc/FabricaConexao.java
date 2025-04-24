package aulas.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConnection() {
        try {
            Properties properties = getProperties();

            String dbName = "curso_java";
            String url = properties.getProperty("URL") + dbName;
            String usuario = properties.getProperty("USERNAME");
            String senha = properties.getProperty("PASSWORD");

            return DriverManager.getConnection(url,usuario,senha);

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties properties = new Properties();
        String caminho = "/conexao.properties";
        properties.load(FabricaConexao.class.getResourceAsStream(caminho));
        return properties;
    }
}
