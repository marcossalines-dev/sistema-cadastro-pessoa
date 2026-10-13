
package test;

import conexao.ConexaoFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TestarConexao {

    public static void main(String[] args) {
        try (Connection conexao = ConexaoFactory.conectar()) {
            System.out.println("Conectado ao MySQL!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o MySQL.");
            e.printStackTrace();
        }
    }
}
