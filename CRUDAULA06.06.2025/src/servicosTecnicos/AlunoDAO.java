// Define o pacote onde a classe está localizada
package servicosTecnicos;

// Importa a classe de conexão com o banco de dados
import servicosTecnicos.Conexao;

// Importa a classe Aluno, que será usada para armazenar os dados vindos do banco
import dominio.Aluno;

// Importa bibliotecas necessárias para trabalhar com banco de dados
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


// Classe responsável por acessar e manipular os dados dos alunos no banco de dados
public class AlunoDAO {
    JButton btnAtualizar = new JButton("Atualizar");
    JButton btnExcluir = new JButton("Excluir");


    // Método para salvar um aluno no banco de dados
    public void salvar(Aluno aluno) {
        // Comando SQL com parâmetros (placeholders ?) para inserir os dados
        String sql = "INSERT INTO alunos (matricula, nome, curso, idade) VALUES (?, ?, ?, ?)";

        // Bloco try-with-resources: garante que a conexão e o statement sejam fechados automaticamente
        try (
                // Abre a conexão com o banco de dados
                Connection conn = Conexao.getConnection();
                // Prepara o comando SQL para execução
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            // Define os valores dos parâmetros do SQL com os dados do objeto Aluno
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getCurso());
            stmt.setInt(4, aluno.getIdade());

            // Executa o comando de inserção
            stmt.executeUpdate();

        } catch (SQLException e) {
            // Em caso de erro, imprime o erro no console
            e.printStackTrace();
        }
    }

    // Método para buscar todos os alunos cadastrados no banco de dados
    public List<Aluno> listarTodos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos";

        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Aluno aluno = new Aluno(
                        rs.getString("matricula"),
                        rs.getString("nome"),
                        rs.getString("curso"),
                        rs.getInt("idade")
                );
                lista.add(aluno);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos: " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

    public void excluir(Aluno aluno) {
        String sql = "DELETE FROM alunos WHERE matricula = ?";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, aluno.getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public class AlunoController {
        private AlunoDAO alunoDAO = new AlunoDAO();

        public void salvarAluno(Aluno aluno) {
            alunoDAO.salvar(aluno);
        }

        public List<Aluno> listarAlunos() {
            return alunoDAO.listarTodos();
        }

        public void atualizarAluno(Aluno aluno) {
            alunoDAO.atualizar(aluno);
        }

        public void excluirAluno(Aluno aluno) {
            alunoDAO.excluir(aluno);
        }
    }

    public void atualizar(Aluno aluno) {
        String sql = "UPDATE alunos SET nome = ?, curso = ?, idade = ? WHERE matricula = ?";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCurso());
            stmt.setInt(3, aluno.getIdade());
            stmt.setString(4, aluno.getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}