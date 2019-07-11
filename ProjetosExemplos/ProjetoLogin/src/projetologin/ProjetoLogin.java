package projetologin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

public class ProjetoLogin {

	public static void main(String[] args) {

		String usuario;
		String senha;
		String diretorio = "C:\\Dev\\JAVA\\CursoUdemy\\java_udemy\\ProjetoLogin\\Login";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o nome do usuário: ");
		usuario = entrada.nextLine();
		System.out.println("Qual a senha do usuário: ");
		senha = entrada.nextLine();
		
		UsuarioSenha uso = new UsuarioSenha();
		
		Calendar c = Calendar.getInstance();
		
		if (usuario.equals(uso.getUsuario())&& senha.equals(uso.getSenha())) {
			System.out.println("Usuário logado!!");
			try {
				
				//cria o arquivo
				FileWriter arquivoTXT = new FileWriter(diretorio + "\\" + "arquivoLogin.txt", true);
				
				//escrever no arquivo
				PrintWriter escreverArq = new PrintWriter(arquivoTXT);
				escreverArq.println("Log de registro de Login");
				escreverArq.printf("Usuario: %s\r\n", uso.getUsuario());
				escreverArq.printf("Senha: %s\r\n", uso.getSenha());
				escreverArq.println(c.getTime());
				escreverArq.println("\r\n-------------------------------------------\r\n");
				escreverArq.close();
				
				
			} catch (IOException e) {
				e.getMessage();
			}
			
		
		}
		else {
			try {
				System.out.println("Usuário não autorizado para login!");
				//cria o arquivo
				FileWriter arquivoTXT = new FileWriter(diretorio + "\\" + "arquivoLogin.txt", true);
				
				//escrever no arquivo
				PrintWriter escreverArq = new PrintWriter(arquivoTXT);
				escreverArq.println("Log de tentativa de Login");
				escreverArq.printf("Usuario: %s\r\n", usuario);
				escreverArq.printf("Senha: %s\r\n", senha);
				escreverArq.println(c.getTime());
				escreverArq.println("\r\n-------------------------------------------\r\n");
				escreverArq.close();
				
			} catch (IOException e) {
				e.getMessage();
			}
		}
		
		
	}

}
