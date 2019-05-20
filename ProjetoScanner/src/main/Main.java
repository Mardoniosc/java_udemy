package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("--------------------------------------");
		System.out.println("------------ MENU PRINCIPAL ----------");
		System.out.println("--------------------------------------");
		System.out.println("-- Opções --");
		System.out.println("1 - Abrir");
		System.out.println("2 - Salvar");
		System.out.println("3 - Fechar");
		System.out.println("--------------------------------------");
		System.out.println("Digite o numero da opção desejada: ");
		
		// importar o ajava.util.Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroOpcao = entrada.nextInt();
		System.out.println("                              ");
		System.out.println("-------------------------------------");
//		System.out.println("O numero desejado foi: " + numeroOpcao);
		System.out.printf("O numero desejado foi %d \n", numeroOpcao);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
	}

}
