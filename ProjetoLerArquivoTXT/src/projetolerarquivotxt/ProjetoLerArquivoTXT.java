package projetolerarquivotxt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProjetoLerArquivoTXT {

	public static void main(String[] args) {

		try {
			FileReader arquivo = new FileReader("C:\\Dev\\JAVA\\CursoUdemy\\java_udemy\\ProjetoLogin\\Login\\arquivoLogin.txt");
			BufferedReader lerArq = new BufferedReader(arquivo);
			String linha = lerArq.readLine(); // le linha por linha mas inicia com null
			
			while (linha != null ) {
				System.out.println(linha);
				linha = lerArq.readLine();//ficar diferente de null e a condição while funcionar
			}
			
			lerArq.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
