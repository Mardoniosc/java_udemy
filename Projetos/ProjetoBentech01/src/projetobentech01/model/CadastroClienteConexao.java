/*
 * Responsável por conectar ao banco de dados.
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
public class CadastroClienteConexao {
    
    public void InserirCliente(){
    
    String SQL = "INSERT INTO tb_cadastro (nome, sobrenome, idade, data_nascimento, sexo, CPF, codigo_cliente) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?)";
    Connection conn = null;
    conn = Conexao.getConnection();//Conectar ao banco de dados
    PreparedStatement stmt = null;  

    
    try {
        
        stmt = conn.prepareStatement(SQL);
        stmt.setString(1, CadastroCliente.nome_cliente);
        stmt.setString(2, CadastroCliente.sobrenome_cliente);
        stmt.setInt(3, CadastroCliente.idade_cliente);
        stmt.setDate(4, CadastroCliente.data_nascimento_cliente);
        stmt.setString(5, CadastroCliente.sexo_cliente);
        stmt.setString(6, CadastroCliente.CPF_cliente);
        stmt.setString(7, CadastroCliente.codigo_cliente);
        
        stmt.executeUpdate();
        

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados.\n Erro: " + ex);
    }
    finally{
        Conexao.fecharConexao(conn, stmt);
    }
}
    
    public void verificarUsuario(){
    String SQL = "SELECT * FROM tb_cadastro";
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
        System.out.println(senha1 + Login.senha + usuario1 + Login.usuario);
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
