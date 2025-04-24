package aulas.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasDesafio {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o parametro de valor: ");
        String valor = entrada.nextLine();

        Connection conexao = FabricaConexao.getConnection();
        String sql = """
                     SELECT * FROM pessoas
                     WHERE nome LIKE ?
                     """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%"+ valor +"%");

        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " - " + p.getNome());
        }

        stmt.close();
        conexao.close();
        entrada.close();

    }
}
