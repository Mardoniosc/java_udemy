package projetowhileii;

import java.util.Scanner;

public class ProejtoWhileII {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int e;
		System.out.println("Para sair digite 0");
		
		while (true) {
			System.out.println("\nEntre com um valor inteiro: ");
			e = entrada.nextInt();
			if (e == 0) {
				System.out.println("Saindo do programa...");
				break;
			}
			System.out.println("Valor digitado foi: " + e);
		}
		
	}

}
