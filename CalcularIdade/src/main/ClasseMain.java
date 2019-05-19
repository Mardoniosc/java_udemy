package main;

import java.util.Scanner;
import java.util.Calendar;

public class ClasseMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();

		System.out.println("--------------------------------------");
		System.out.println("-- Digite sua idade: ");
		System.out.println("--------------------------------------");
		int anoNascimento = calendario.get(Calendar.YEAR) - entrada.nextInt();
		
		System.out.printf("Você nasceu em " + (anoNascimento)+ "\n");
		System.out.println("--------------------------------------");
		
		
	}// fim do metodo man

}// fim da ClasseMain
