
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author clebe
 */
public class Conexao {

    //criando um método ressponável por estabelecer uma conexão com o banco
    public static Connection conectar() {
        //criando um método ressponável por estabelecer uma conexão com o banco

        Connection conexao = null;
        //criando o driver  correspondente ao banco
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/bdvendas?"; //useTimezone=true&serverTimezone=UTC
        String user = "root";
        String senha = "root";
        //estabelecer a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!!");
            return conexao;
        } catch (Exception e) {
            //a lihna abaixo server de apoio para esclarecer o erro
            JOptionPane.showMessageDialog(null, "Opss, algo deu errado: " + e);
            return null;
        }

    }

    public static Connection desconectar() {
        Connection conexao = null;
        try {
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return conexao;
    }

}
