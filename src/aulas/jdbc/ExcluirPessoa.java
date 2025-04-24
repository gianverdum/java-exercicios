package aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o codigo do pessoa: ");
        int codigo = entrada.nextInt();

        Connection conexao = FabricaConexao.getConnection();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,codigo);
        int contador = stmt.executeUpdate();
        if(contador > 0){
            System.out.println("Pessoa excluida com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
            System.out.println("Linhas afetadas: " + contador);

        entrada.close();
        conexao.close();
    }
}
