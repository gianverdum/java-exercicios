package aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection conexao;

    public int incluir(String sql, Object... params) {
        try {
            PreparedStatement stmt = getConexao().prepareStatement(
                    sql, PreparedStatement.RETURN_GENERATED_KEYS);
            if(stmt.executeUpdate() > 0) {
                ResultSet resultado = stmt.getGeneratedKeys();

                if(resultado.next()) {
                    return resultado.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            }

            indice++;
        }
    }

    private Connection getConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {
        }

        conexao = FabricaConexao.getConnection();
        return conexao;
    }
}
