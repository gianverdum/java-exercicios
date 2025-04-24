package aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlterarNomePessoaDesafio {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConnection();

        System.out.println("Busque a pessoa que deseja alterar: ");
        String valor = entrada.nextLine();

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

        System.out.println("Informe o código da pessoa: ");
        valor = entrada.nextLine();

        System.out.println("Informe o novo nome: ");
        String novoNome = entrada.nextLine();

        sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, novoNome);
        //noinspection JpaQueryApiInspection
        stmt.setInt(2, Integer.parseInt(valor));

        Integer linhasAfetadas = stmt.executeUpdate();

        stmt.close();
        conexao.close();
        entrada.close();

    }
}
