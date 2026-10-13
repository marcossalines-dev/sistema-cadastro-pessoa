

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    private static final String URL = System.getenv("DB_URL");
    private static final String USUARIO = System.getenv("DB_USER");
    private static final String SENHA = System.getenv("DB_PASSWORD");

    public static Connection conectar() throws SQLException {
        if (URL == null || USUARIO == null || SENHA == null) {
            throw new SQLException(
                    "Configure as variáveis de ambiente do banco de dados."
            );
        }

        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
