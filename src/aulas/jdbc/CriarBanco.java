package aulas.jdbc;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {

        Dotenv dotenv = Dotenv.load();

        String url = dotenv.get("URL");
        String usuario = dotenv.get("USERNAME");
        String senha = dotenv.get("PASSWORD");

        Connection conexao = DriverManager
                .getConnection(url,usuario,senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso");
        conexao.close();
    }
}
