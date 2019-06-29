package projetosqlite;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Mardonio S Costa
 *
 */
public class CriarTabelaPessoFisica {
	
	public void criarTabela() { // metodo vai criar uma tabela
		
		//URL de conexão
		String url = "jdbc:sqlite:C:/Dev/JAVA/CursoUdemy/java_udemy/ProjetoSQLite/banco_de_dados/banco_sqlite.db";
		
		// sql statement para criar uma nova tabela
		String sql  = "CREATE TABLE IF NOT EXISTS tabela_pessoa_fisica (\n"
					+ "id_pessoa_fisica integer PRIMARY KEY, \n"// um campo id para pessoa fisica
					+ "nome text NOT NULL, \n"
					+ "sobrenome NOT NULL, \n"
					+ "cpf text NOT NULL \n"
					+ ")";
		
		try {
			Connection conn = DriverManager.getConnection(url);
			// instanciar o statement
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
