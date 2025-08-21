package jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author clebe
 */
public class TesteConexao {

    public static void main(String[] args) {

        try {
            Conexao.conectar();

        } catch (Exception erro) {
            // JOptionPane.showMessageDialog(null, "Ops aconteceu o erro: "  + erro);    
        }
    }
}
