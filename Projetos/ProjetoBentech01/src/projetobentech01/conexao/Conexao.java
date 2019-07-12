/*
 * Classe para conectar ao banco de dados 
 */
package projetobentech01.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author p772920
 */
public class Conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://DF7562NT713:3306/sd_chamados";
    private static final String USER = "sd";        //nome de um usuário de seu BD      
    private static final String PASS = "sd";      //sua senha de acesso

    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException |SQLException ex) {
            
            throw new RuntimeException("Algo aconteceu de errado com a conexão com o banco, veja: " + ex);
        }
    }
    public static void fecharConexao(Connection conn){
        if (conn != null){//se estiver conectado
            try {
                conn.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Algo aconteceu de errado com o fechamento da conexão com o banco, veja: " + ex);
            }
        }  
    }
    public static void fecharConexao(Connection conn, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Algo aconteceu de errado com o fechamento da conexão com o banco, veja: " + ex);
            }
        }
        fecharConexao(conn);
    }
    public static void fecharConexao(Connection conn, PreparedStatement stmt, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Algo aconteceu de errado com o fechamento da conexão com o banco, veja: " + ex);
            }
        }
        fecharConexao(conn, stmt);
        
    }
}
