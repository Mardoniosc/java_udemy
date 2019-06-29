package conexoes;
/*
 * Author: Mardonio S Costa
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	// atributo de conex�o com o banco de dados
	private Connection conexao;
	
	
	/**
	 * Metodo que conecta ao banco de dados e caso n�o exista cria um
	 * 
	 * @return true - a conex�o foi realizada
	 * @throws ClassNotFoundException 
	 */
	public boolean conectar() throws ClassNotFoundException {
		try {
			// comando para abrir a biblioteca do SQLite
			Class.forName("org.sqlite.JDBC");
			//URL de conex�o
			String url = "jdbc:sqlite:C:/Dev/JAVA/CursoUdemy/java_udemy/ProjetoSQLite/banco_de_dados/banco_sqlite.db";
			//conectar com o banco
			this.conexao = DriverManager.getConnection(url);
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		System.out.println("Conectou com o banco!\n");
		return true;
	}
	/**
	 * Metodo para desconectar do banco de dados
	 * 
	 * @return true - caso desconecte
	 */
	
	public boolean desconectar() {
		try {
			if(this.conexao.isClosed() == false)//se n�o estiver fechado
				this.conexao.close();//fecha
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;//caso n�o desconecte retone false
		}
		
		System.out.println("Desconectou com o banco!\n");
		return true;
	}

}
