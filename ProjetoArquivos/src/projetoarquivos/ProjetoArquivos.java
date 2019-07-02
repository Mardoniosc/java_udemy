package projetoarquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProjetoArquivos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual será o nome do diretorio: ");
		
		// Criar um diretorio
		String nomeDiretorio = entrada.nextLine();
		
		File diretorio = new File("C:\\Dev\\JAVA\\CursoUdemy\\java_udemy\\" + nomeDiretorio);
		
		if (diretorio.exists()) {
			System.out.println("Diretorio já existe!");
		}
		
		else {
			diretorio.mkdir();
			System.out.println("Diretorio criado com sucesso!");
			System.out.println(diretorio.getAbsolutePath());
		}
		
		
		// criar subDiretorio
		
		System.out.println("Qual será o nome do subdiretorio: ");
		String nomeSubDiretorio = entrada.nextLine();
		
		File subDiretorio =  new File(diretorio.getAbsoluteFile() + "\\" + nomeSubDiretorio);
		
		if (subDiretorio.exists()) {
			System.out.println("SubDiretorio já existe!");
		}
		
		else {
			subDiretorio.mkdir();
			System.out.println("SubDiretorio criado com sucesso!");
			System.out.println(subDiretorio.getAbsolutePath());
		}
		
		// escrever e criar um arquivo .txt
		
		try {
			FileWriter arquivoTXT = new FileWriter(subDiretorio.getAbsoluteFile() + "\\" + "arquivo.txt");
			
			//escrever no arquivo
			PrintWriter escreverArq = new PrintWriter(arquivoTXT);
			escreverArq.println("Cabeçalho do arquivo.txt");
			escreverArq.println("Nome: Mardonio");
			escreverArq.println("Sobrenome: Costa");
			escreverArq.close();
			
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}

}
