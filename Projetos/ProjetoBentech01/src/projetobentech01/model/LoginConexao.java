/*
 * Será responsável pela execução dos campos sql
 */
package projetobentech01.model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetobentech01.conexao.Conexao;
import projetobentech01.views.FrmTelaPrincipal;


/**
 *
 * @author p772920
 */
public class LoginConexao {
    
    public void InserirUsuário(){
    
    String SQL = "INSERT INTO tb_login (usuario, senha) VALUES(?, ?)";
    Connection conn = null;
    conn = Conexao.getConnection();//Conectar ao banco de dados
    PreparedStatement stmt = null;  

    
    try {
        
        stmt = conn.prepareStatement(SQL);
        stmt.setString(1, Login.usuario);
        stmt.setString(2, Login.senha);
        stmt.executeUpdate();

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados.\n Erro: " + ex);
    }
    finally{
        Conexao.fecharConexao(conn, stmt);
    }
}
    
    public void verificarUsuario(){
    String SQL = "SELECT usuario, senha FROM sd_chamados.tb_login where usuario = '" +Login.usuario +"'";
    Connection conn = null;
    conn = Conexao.getConnection();//Conectar ao banco de datos
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    
    try {
        
        stmt = conn.prepareStatement(SQL);
        rs = stmt.executeQuery();
        rs.next();
        String usuario1 = rs.getString("usuario");
        String senha1 = rs.getString("senha");

        
        //testar se o usuário é o mesmo digitado...
        // System.out.println(senha1 + Login.senha + usuario1 + Login.usuario);
        if ((usuario1.equals(Login.usuario)) && (senha1.equals(Login.senha))){
            FrmTelaPrincipal tp = new FrmTelaPrincipal();
            tp.setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }
    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, "Erro ao verificar o usuário no banco de dados!.\n Erro: " + ex);
    }
    finally{
        Conexao.fecharConexao(conn, stmt);
    }
    
    }
    
}
