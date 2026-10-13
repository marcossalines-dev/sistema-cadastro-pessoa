
package repositorio;

import conexao.ConexaoFactory;
import dominio.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

    public void cadastrar(Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO pessoas (nome, idade, sexo, peso, altura, nacionalidade) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexao = ConexaoFactory.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, pessoa.getNome());
            comando.setInt(2, pessoa.getIdade());
            comando.setString(3, String.valueOf(pessoa.getSexo()));
            comando.setDouble(4, pessoa.getPeso());
            comando.setDouble(5, pessoa.getAltura());
            comando.setString(6, pessoa.getNacionalidade());

            comando.executeUpdate();

            System.out.println("Pessoa cadastrada com sucesso!");
        }
    }

}
