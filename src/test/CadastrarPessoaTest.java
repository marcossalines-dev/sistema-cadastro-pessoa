
package test;

import dominio.Pessoa;
import repositorio.PessoaDAO;

import java.sql.SQLException;

public class CadastrarPessoaTest {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Alessandra");
        pessoa.setIdade(20);
        pessoa.setSexo('F');
        pessoa.setPeso(65.0);
        pessoa.setAltura(1.70);
        pessoa.setNacionalidade("Brasil");

        PessoaDAO pessoaDAO = new PessoaDAO();

        try {
            pessoaDAO.cadastrar(pessoa);
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pessoa.");
            e.printStackTrace();
        }
    }
}
