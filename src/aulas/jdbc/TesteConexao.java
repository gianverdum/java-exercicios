package aulas.jdbc;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        Dotenv dotenv = Dotenv.load();

        String url = dotenv.get("STRING_DE_CONEXAO");
        String usuario = dotenv.get("USERNAME");
        String senha = dotenv.get("PASSWORD");

        Connection conexao = DriverManager
                .getConnection(url,usuario,senha);

        System.out.println("Conexão executada com sucesso!");
        conexao.close();
    }
}
