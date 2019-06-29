package projetosqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirPessoaFisica {
	
	// metodo de inserir pessoa 

	private Connection conectar(){
		
		//URL de conexão
		String url = "jdbc:sqlite:C:/Dev/JAVA/CursoUdemy/java_udemy/ProjetoSQLite/banco_de_dados/banco_sqlite.db";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		
		return conn;
	}
	
	public void inserirDados(String nome, String sobrenome, String cpf) {

		String sql = "insert into tabela_pessoa_fisica (nome, sobrenome, cpf) VALUES (?, ?, ?)";
		
		try {
			Connection conn = this.conectar();//metod privado criado acima de conexão
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nome);
			pstmt.setString(2, sobrenome);
			pstmt.setString(3, cpf);
			
			pstmt.executeUpdate();
			System.out.println("Dados da pessoa inserido com sucesso!\n");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
