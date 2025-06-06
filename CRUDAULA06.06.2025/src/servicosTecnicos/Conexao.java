// Define o pacote onde a classe está localizada
package servicosTecnicos;

// Importa as bibliotecas necessárias para exibir mensagens e conectar ao banco de dados
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe utilitária responsável por fornecer conexões com o banco de dados
public class Conexao {

    // Constantes com os dados necessários para conectar ao banco de dados
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/escola?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "unifesspa";
    private static final String PASS = "unifesspa"; // Senha do banco de dados

    // Método público e estático que retorna uma conexão com o banco
    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "❌ Driver JDBC não encontrado!");
            e.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "❌ Erro ao conectar: " + ex.getMessage());
            ex.printStackTrace();  // Adicione isso para mostrar detalhes no console
        }

        return connection;
    }


    // Linha comentada que era usada como alternativa: chamada direta do DriverManager
        // return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
