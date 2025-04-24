package aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoaDesafioResolucao {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConnection();
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();

        if(rs.next()) {
            Pessoa p = new Pessoa(rs.getInt(1), rs.getString(2));
            System.out.println("O nome atual é " + p.getNome());
            entrada.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            //noinspection JpaQueryApiInspection
            stmt.setInt(2, codigo);
            stmt.executeUpdate();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }
}
